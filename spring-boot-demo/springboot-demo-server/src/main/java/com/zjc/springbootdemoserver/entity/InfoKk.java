package com.zjc.springbootdemoserver.entity;

import lombok.Data;
import lombok.extern.log4j.Log4j;

@Data
@Log4j
public class InfoKk {

	private static final long serialVersionUID = 1L;
	private String id;

	private String nid;

	private String name;

	private String nname;

	private Double coordx;

	private Double coordy;

	private String direction;

	private Integer laneNum;

	private String dept;

	private String deptName;

	private Integer inOutType;
}