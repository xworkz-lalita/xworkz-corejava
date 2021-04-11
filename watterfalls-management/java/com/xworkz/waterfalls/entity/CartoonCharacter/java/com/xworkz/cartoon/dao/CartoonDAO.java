package com.xworkz.cartoon.dao;

import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;
import com.xworkz.cartoon.tester.CartoonTester;

public interface CartoonDAO {
public void saveAll(List<CartoonEntity> entity);
public CartoonEntity findByName(String name);
public CartoonEntity findByChannelAndLanguage(ChannelName channelName, String langauge);
}
