package org.example.javaapr25springcontroller.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Product {

	private Integer productId;
	private String productName;
	private String productDesc;

}
