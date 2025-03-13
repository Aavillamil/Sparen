package com.sparen.income.domain.models;

public class Priorities {
    private Integer idPriority;
    private String descriptionPriority;

    public Priorities() {
    }

    public Priorities(Integer idPriority, String descriptionPriority) {
        this.idPriority = idPriority;
        this.descriptionPriority = descriptionPriority;
    }

    public Integer getIdPriority() {
        return idPriority;
    }

    public void setIdPriority(Integer idPriority) {
        this.idPriority = idPriority;
    }

    public String getDescriptionPriority() {
        return descriptionPriority;
    }

    public void setDescriptionPriority(String descriptionPriority) {
        this.descriptionPriority = descriptionPriority;
    }

    @Override
    public String toString() {
        return "Priorities{" +
                "idPriority=" + idPriority +
                ", descriptionPriority='" + descriptionPriority + '\'' +
                '}';
    }
}
