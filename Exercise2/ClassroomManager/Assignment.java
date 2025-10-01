public class Assignment {
    private String details;

    public Assignment(String details) {
        this.details = details.trim();
    }

    public String getDetails() {
        return details;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Assignment)) return false;
        Assignment other = (Assignment) obj;
        return details.equalsIgnoreCase(other.details);
    }

    @Override
    public int hashCode() {
        return details.toLowerCase().hashCode();
    }
}
