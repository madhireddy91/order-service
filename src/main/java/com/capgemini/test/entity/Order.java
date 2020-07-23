package com.capgemini.test.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="ORDER_TBL")
public class Order {

	@Id
	@GeneratedValue
	private int id;
	private String customeName;
	private String shippingAddress;
	private long total;
	@OneToMany(targetEntity = OrderItem.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName = "id")
	private List<OrderItem> orderItems;
	
	
}
