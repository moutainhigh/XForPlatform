package com.xfor.store.manage.service;

import com.xfor.infrastructure.core.common.service.ServiceContext;
import com.xfor.infrastructure.core.store.model.Store;
import com.xfor.infrastructure.core.store.model.StoreException;
import com.xfor.infrastructure.core.store.model.StoreNotFoundException;
import com.xfor.infrastructure.core.store.model.StoreStateEnum;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StoreManageServiceTests {

    @Autowired
    private StoreManageService storeManageService;


    protected ServiceContext doGetServiceContext() {
        return ServiceContext._empty();
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createStore() throws StoreException {
        Store fields = new Store();
        fields.setCode("S000000001");
        fields.setName("Name0001");
        fields.setMemo("Memo0001");
        //
        Store store = this.storeManageService.createStore(fields);
        Assert.notNull(store, "");
    }

    @Test
    void saveStore() throws StoreException {
        Store fields = new Store();
        fields.setSid("2F360426FCB24C8385AA03CA7FD30A30");
        fields.setName("Name0002");
        fields.setMemo("Memo0002");
        //
        Store store = this.storeManageService.saveStore(fields);
        Assert.notNull(store, "");
    }

    @Test
    void openStore() throws StoreNotFoundException {
        String storeSid = "2F360426FCB24C8385AA03CA7FD30A30";
        Store store = this.storeManageService.openStore(storeSid);
        Assert.notNull(store, "");
    }

    @Test
    void closeStore() throws StoreNotFoundException {
        String storeSid = "2F360426FCB24C8385AA03CA7FD30A30";
        Store store = this.storeManageService.closeStore(storeSid);
        Assert.notNull(store, "");
    }

    @Test
    void cancelStore() throws StoreNotFoundException {
        String storeSid = "2F360426FCB24C8385AA03CA7FD30A30";
        Store store = this.storeManageService.cancelStore(storeSid);
        Assert.notNull(store, "");
    }
}