public class Naryn   {

     private String name;
     private int SkGorodov; //это сколько городов в области

    public Naryn(String name, int skGorodov) {
        this.name = name;
        SkGorodov = skGorodov;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkGorodov() {
        return SkGorodov;
    }

    public void setSkGorodov(int skGorodov) {
        SkGorodov = skGorodov;
    }

    @Override
    public String toString() {
        return "Naryn{" +
                "name='" + name + '\'' +
                ", SkGorodov=" + SkGorodov +
                '}';
    }
}
