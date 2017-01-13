package org.ausimus.wurmunlimited.mods.mockfacades;

import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;

/**
 * Created by Ausimus on 1/12/2017.
 */
public class Facade_CreationEntry {
    Facade_CreationEntry() {
        if (Constants.CanCraftFacades) {
            //Log Wall
            AdvancedCreationEntry FacadeWallLog = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFWTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeWallLog.addRequirement(new CreationRequirement(1, ItemList.log, 8, true));
            FacadeWallLog.addRequirement(new CreationRequirement(2, ItemList.pegWood, 16, true));
            //Log Door Narrow
            AdvancedCreationEntry FacadeDoorNarrowLog = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFDNTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeDoorNarrowLog.addRequirement(new CreationRequirement(1, ItemList.log, 8, true));
            FacadeDoorNarrowLog.addRequirement(new CreationRequirement(2, ItemList.pegWood, 16, true));
            FacadeDoorNarrowLog.addRequirement(new CreationRequirement(3, ItemList.plank, 3, true));
            //Right Strut
            CreationEntryCreator.createSimpleEntry(SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFRSTemplateID, false, true, 0.0f, true, true, CreationCategories.DECORATION);
            //Left Strut
            CreationEntryCreator.createSimpleEntry(SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFLSTemplateID, false, true, 0.0f, true, true, CreationCategories.DECORATION);
            //Log Door Wide
            AdvancedCreationEntry FacadeDoorWideLog = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFDWTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeDoorWideLog.addRequirement(new CreationRequirement(1, ItemList.log, 8, true));
            FacadeDoorWideLog.addRequirement(new CreationRequirement(2, ItemList.pegWood, 16, true));
            FacadeDoorWideLog.addRequirement(new CreationRequirement(3, ItemList.plank, 3, true));
            //Log Window
            AdvancedCreationEntry FacadeLogWindow = CreationEntryCreator.createAdvancedEntry
                    (SkillList.CARPENTRY, ItemList.log, ItemList.log, Constants.LFWindowTemplateID, false, false, 0.0F, true, true, CreationCategories.DECORATION);
            FacadeLogWindow.addRequirement(new CreationRequirement(1, ItemList.log, 8, true));
            FacadeLogWindow.addRequirement(new CreationRequirement(2, ItemList.pegWood, 16, true));
            FacadeLogWindow.addRequirement(new CreationRequirement(3, ItemList.plank, 4, true));
        }
    }
}
