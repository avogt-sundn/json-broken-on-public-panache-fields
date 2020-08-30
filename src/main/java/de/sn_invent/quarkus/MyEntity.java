package de.sn_invent.quarkus;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class MyEntity extends PanacheEntityBase {
    @Id
    public UUID id;

    public String name;

    public MyEntity(){
        this.id = UUID.randomUUID();
    }
    public MyEntity(String s) {
        this();
        this.name = s;
    }
}
