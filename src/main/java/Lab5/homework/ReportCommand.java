package Lab5.homework;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ReportCommand extends CatalogCommand {
    private final String outputPath;

    public ReportCommand(String outputPath) {
        this.outputPath = outputPath;
    }

    @Override
    public void execute(Catalog catalog) throws InvalidCommandException {
        List<Document> documents = catalog.getDocuments();
        try {
            FileWriter writer = new FileWriter(outputPath);
            Map<String, Object> model = new HashMap<>();
            model.put("documents", documents);
            freemarker.template.Configuration configuration = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_30);
            configuration.setClassForTemplateLoading(Catalog.class, "/");
            freemarker.template.Template template = configuration.getTemplate("report.ftl");
            template.process(model, writer);
            writer.close();
            Desktop.getDesktop().open(new File(outputPath));
        } catch (IOException e) {
            throw new InvalidCommandException("Failed to write report file: " + e.getMessage());
        } catch (Exception e) {
            throw new InvalidCommandException("Failed to create report: " + e.getMessage());
        }
    }
}
