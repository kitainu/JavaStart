package Equals.Zadanie;

import java.util.Objects;

public class Computer {

    private String producer;
    private int model;

    public Computer(String producer, int model) {
        this.model = model;
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public int getModel() {
        return model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" + "producer='" + producer + '\'' + ", model=" + model + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }


        if (obj == null) {
            return false;
        }
        if ((obj instanceof Computer)) {
            Computer otherComputer = (Computer) obj;
            if (producer != null)
                if (producer.equals(otherComputer.getProducer()) && otherComputer.getModel() == this.model) {
                    return true;
                }
        } else {
            return false;
        }
        return false;
    }


}
