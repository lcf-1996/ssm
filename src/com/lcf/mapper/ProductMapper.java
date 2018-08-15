package com.lcf.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.lcf.pojo.Product;

@Repository
public interface ProductMapper {
	@Select("select * from product where id = #{id}")
	Product list(int id);
}
