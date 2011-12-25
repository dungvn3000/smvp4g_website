package com.smvp4g.client.client.module.main.view;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.smvp4g.client.client.constant.DomIdConstant;
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

    private HorizontalPanel verticalPanel = new HorizontalPanel();

    @Override
    protected void initializeView() {
        verticalPanel.add(new MenuLink("Home Page", "page/homePage"));
        verticalPanel.add(new MenuLink("Example", "page/examplePage"));
        verticalPanel.setSpacing(5);
        setWidget(verticalPanel);
    }
}
