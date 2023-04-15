public enum Audiencias {
    G("G"), PG("PG"), PG13("PG-13"), R("R"), UNRATED("UNRATED");
    private String name;

    private Audiencias(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
