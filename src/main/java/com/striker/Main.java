package com.striker;

import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.util.Properties;

public class Main {
    private static Properties props;

    public static void main(String[] args) throws Exception {
        initialize(args);

        String location = props.getProperty("vpn.location", "/opt/cisco/anyconnect/bin/vpnui");
        String username = props.getProperty("vpn.username");
        String password = props.getProperty("vpn.password");

        Runtime.getRuntime().exec(location);
        Thread.sleep(3000);
        Keyboard keyboard = new Keyboard();
        keyboard.clickKeys(KeyEvent.VK_ENTER);
        Thread.sleep(7000);
        keyboard.type(username);
        keyboard.clickKeys(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        keyboard.type(password);
        keyboard.clickKeys(KeyEvent.VK_ENTER);
    }

    private static void initialize(String[] args) throws Exception {
        String filepath = args.length > 0 ? args[0] : null;
        if(filepath == null || filepath.isBlank()) {
            filepath = "app.properties";
        }
        props = new Properties();
        props.load(new FileReader(filepath));
    }
}