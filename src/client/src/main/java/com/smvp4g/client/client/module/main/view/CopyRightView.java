package com.smvp4g.client.client.module.main.view;

import com.google.gwt.user.client.ui.HTML;
import com.smvp4g.client.client.constant.DomIdConstant;
import com.smvp4g.mvp.client.core.view.AbstractView;
import com.smvp4g.mvp.client.core.view.annotation.View;

/**
 * The Class CopyRightView.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 11:38 AM
 */
@View(parentDomId = DomIdConstant.BOTTOM_PANEL)
public class CopyRightView extends AbstractView {
    @Override
    protected void initializeView() {
        HTML html = new HTML("<p style='text-align:center'>" +
                "Copyright 2012 <a href='http://smvp4g.com'>smvp4g.com</a></p>");
        setWidget(html);
    }
}
