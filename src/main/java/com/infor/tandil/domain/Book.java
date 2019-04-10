package com.infor.tandil.domain;



import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Book.
 */
@Entity
@Table(name = "book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "toked")
    private Boolean toked;

    @Column(name = "person")
    private String person;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Book name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditorial() {
        return editorial;
    }

    public Book editorial(String editorial) {
        this.editorial = editorial;
        return this;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Boolean isToked() {
        return toked;
    }

    public Book toked(Boolean toked) {
        this.toked = toked;
        return this;
    }

    public void setToked(Boolean toked) {
        this.toked = toked;
    }

    public String getPerson() {
        return person;
    }

    public Book person(String person) {
        this.person = person;
        return this;
    }

    public void setPerson(String person) {
        this.person = person;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        if (book.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), book.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Book{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", editorial='" + getEditorial() + "'" +
            ", toked='" + isToked() + "'" +
            ", person='" + getPerson() + "'" +
            "}";
    }
}
