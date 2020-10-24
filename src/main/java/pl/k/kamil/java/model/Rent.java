package pl.k.kamil.java.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "rent")
public class Rent {


    @Id
    @Column(name = "rent_id")
    @GeneratedValue(generator = "donationSeq")
    @GenericGenerator(name = "donationSeq", strategy = "increment")
    private int rentId;

    @Column(name = "rent_date")
    private Date rent_date;

    @Column(name = "return_date")
    private Date return_date;

    @ManyToOne(targetEntity = Car.class)
    private Car car;

    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;


}
