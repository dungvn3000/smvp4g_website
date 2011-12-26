package com.smvp4g.client.client.module.main.view;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.smvp4g.client.client.constant.DomIdConstant;
import com.smvp4g.client.client.module.page.place.ExamplePagePlace;
import com.smvp4g.client.client.module.page.place.HomePagePlace;
import com.smvp4g.mvp.client.core.eventbus.annotation.HistoryHandler;
import com.smvp4g.mvp.client.core.view.AbstractView;
import com.smvp4g.mvp.client.core.view.annotation.View;
import com.smvp4g.mvp.client.widget.MenuLink;

/**
 * The Class MainMenuView.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 10:56 AM
 */
@View(parentDomId = DomIdConstant.TOP_PANEL)
public class MainMenuView extends AbstractView {

    @HistoryHandler
    public MenuLink homePage = new MenuLink("Home Page", HomePagePlace.class);

    @HistoryHandler
    public MenuLink examplePage = new MenuLink("Example", ExamplePagePlace.class);

    private HorizontalPanel verticalPanel = new HorizontalPanel();

    @Override
    protected void initializeView() {
        verticalPanel.add(homePage);
        verticalPanel.add(examplePage);
        verticalPanel.setSpacing(5);
        setWidget(verticalPanel);
        setStyleName("topmenu");
    }
}
