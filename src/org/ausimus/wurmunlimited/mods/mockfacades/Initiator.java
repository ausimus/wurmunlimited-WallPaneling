package org.ausimus.wurmunlimited.mods.mockfacades;

import org.gotti.wurmunlimited.modloader.interfaces.*;

import java.util.Properties;

/**
 * Created by Ausimus on 1/12/2017.
 */
public class Initiator implements WurmServerMod, Configurable, ItemTemplatesCreatedListener, ServerStartedListener {
    @Override
    public void configure(Properties properties) {
        //facades
        Constants.CanCraftFacades = Boolean.parseBoolean(properties.getProperty("CanCraftFacades", Boolean.toString(Constants.CanCraftFacades)));
        Constants.LFWTemplateID = Integer.parseInt(properties.getProperty("LFWTemplateID", Integer.toString(Constants.LFWTemplateID)));
        Constants.LFDNTemplateID = Integer.parseInt(properties.getProperty("LFDNTemplateID", Integer.toString(Constants.LFDNTemplateID)));
        Constants.LFRSTemplateID = Integer.parseInt(properties.getProperty("LFRSTemplateID", Integer.toString(Constants.LFRSTemplateID)));
        Constants.LFLSTemplateID = Integer.parseInt(properties.getProperty("LFLSTemplateID", Integer.toString(Constants.LFLSTemplateID)));
        Constants.LFDWTemplateID = Integer.parseInt(properties.getProperty("LFDWTemplateID", Integer.toString(Constants.LFDWTemplateID)));
        Constants.LFWindowTemplateID = Integer.parseInt(properties.getProperty("LFWindowTemplateID", Integer.toString(Constants.LFWindowTemplateID)));
    }

    @Override
    public void onItemTemplatesCreated() {
        new Facade_ItemTemplateCreator();
    }

    @Override
    public void onServerStarted() {
        new Facade_CreationEntry();
    }
}