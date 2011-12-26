package com.smvp4g.client.client.module.page.view;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.smvp4g.client.client.constant.DomIdConstant;
import com.smvp4g.mvp.client.core.view.AbstractView;
import com.smvp4g.mvp.client.core.view.annotation.View;

/**
 * The Class DocumentView.
 *
 * @author Nguyen Duc Dung
 * @since 12/26/11, 11:30 AM
 */
@View(parentDomId = DomIdConstant.CONTENT_PANEL)
public class DocumentView extends AbstractView {
    @Override
    protected void initializeView() {
        setWidget(new HTML("<h2>Coming soon</h2>"));
    }
}
