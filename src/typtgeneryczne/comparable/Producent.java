package typtgeneryczne.comparable;

public class Producent implements Comparable<Producent> {
    private String producer;
    private String name;
    private String category;

    @Override
    public String toString() {
        return " category: "+ category +  "produnr : " + producer + " name: "+ name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Producent(String producer, String name, String category) {
        this.producer = producer;
        this.name = name;
       setCategory(category);
    }

    @Override
    public int compareTo(Producent p){
        int categoryCompare = category.compareTo(p.getCategory());
        if(categoryCompare!=0){
        return categoryCompare;}
        int producerCompare = producer.compareTo(p.getProducer());
        if (producerCompare!=0){
            return producerCompare;}
        return   name.compareTo(p.getName());

    }


}
