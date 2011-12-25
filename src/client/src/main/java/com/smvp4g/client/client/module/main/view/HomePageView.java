package com.smvp4g.client.client.module.main.view;

import com.google.gwt.user.client.ui.Label;
import com.smvp4g.client.client.constant.DomIdConstant;
import com.smvp4g.mvp.client.core.view.AbstractView;
import com.smvp4g.mvp.client.core.view.annotation.View;

/**
 * The Class HomePageView.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 11:03 AM
 */
@View(parentDomId = DomIdConstant.CONTENT_PANEL)
public class HomePageView extends AbstractView {
    @Override
    protected void initializeView() {
        setWidget(new Label("content"));
        setHeight("100px");
    }
}
