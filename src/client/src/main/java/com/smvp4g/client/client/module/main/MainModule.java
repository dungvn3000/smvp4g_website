package com.smvp4g.client.client.module.main;

import com.google.gwt.user.client.ui.RootPanel;
import com.smvp4g.mvp.client.core.module.AbstractModule;
import com.smvp4g.mvp.client.core.module.annotation.Module;

/**
 * The Class MainModule.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 10:53 AM
 */
@Module
public class MainModule extends AbstractModule {
    @Override
    public void configure() {
    }

    @Override
    public void start() {
        RootPanel.get("loading").setVisible(false);
    }
}
