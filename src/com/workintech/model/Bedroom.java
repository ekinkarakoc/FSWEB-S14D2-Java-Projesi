package com.workintech.model;

public class Bedroom extends Room{
    private String name;

    private Bed bed;

    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(Wall wall, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp,
    String name, Bed bed, Wardrobe wardrobe, Carpet carpet) {
        super(wall, wall2, wall3, wall4, ceiling, lamp);
        this.name = name;
        this.bed = bed;
        this.wardrobe= wardrobe;
        this.carpet = carpet;
    }

    @Override
    public String toString() {
        return super.toString() + "Bedroom{" +
                "name='" + name + '\'' +
                ", bed=" + bed +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                '}';
    }
}
