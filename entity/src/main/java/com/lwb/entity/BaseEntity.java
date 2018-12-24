package com.lwb.entity;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.Id;

/**
 * @author liuweibo
 * @date 2018/12/24
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BaseEntity {
    @Id
    Long id;
}
