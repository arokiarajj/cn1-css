/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.themes.nowui;

import com.codename1.ui.Command;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shannah
 */
public class ChannelsForm extends Form {
    ChannelsFormTpl tpl;
    
    public ChannelsForm(Resources theme) {
        setUIID("NoPaddingForm");
        setLayout(new BorderLayout());
        Map ctx = new HashMap();
        ctx.put("res", theme);
        tpl = new ChannelsFormTpl(ctx);
        addComponent(BorderLayout.CENTER, tpl.getRoot());
        final Form current = Display.getInstance().getCurrent();
        Command back = new Command(" ", i("backIconImage")) {
            @Override
            public void actionPerformed(ActionEvent evt) {
                current.showBack();
            }
        };
        setBackCommand(back);
        Toolbar toolbar = new Toolbar();
        
        this.setToolBar(toolbar);
        new NUISideMenu().install(theme, toolbar);
    }
    
    private Image i(String name) {
        return UIManager.getInstance().getThemeImageConstant(name);
    }
}
