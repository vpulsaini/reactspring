package com.example.demo.entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="tbl_notes")
@Data

public class Note {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String body;
	private String category;
	

}
