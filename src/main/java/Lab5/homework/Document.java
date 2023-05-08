package Lab5.homework;


import java.util.Map;

class Document {
    private final String id;
    private final String name;
    private final String path;
    private final Map<String, String> tags;

    public Document(String id, String name, String path, Map<String, String> tags) {
        if (id == null || id.isEmpty() || name == null || name.isEmpty() || path == null || path.isEmpty()) {
            throw new IllegalArgumentException("Invalid document data");
        }
        this.id = id;
        this.name = name;
        this.path = path;
        this.tags = tags;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name).append(" (").append(path).append(")");
        for (Map.Entry<String, String> entry : tags.entrySet()) {
            sb.append(" [").append(entry.getKey()).append(": ").append(entry.getValue()).append("]");
        }
        return sb.toString();
    }
}