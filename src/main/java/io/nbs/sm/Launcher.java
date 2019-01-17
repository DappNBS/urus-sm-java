package io.nbs.sm;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Package : io.nbs.sm
 * @DateTime : 2019/1/17 11:34
 * <p>
 *
 * </p>
 * @Author : lanbery
 * Copyright (c) 2019 - 2025 ,NBS ,lambor.c<lamborcai@gmail.com>.
 * All rights reserved.
 */
public class Launcher {

    static final Logger logger = LoggerFactory.getLogger(Launcher.class);

    private static Launcher context;

    static {

    }

    private Launcher(){
        //TODO
    }

    public Launcher(String[] args){
        context = this;
    }
}
