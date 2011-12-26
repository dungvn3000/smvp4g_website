package com.smvp4g.client.client.module.page.view;

import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Hyperlink;
import com.smvp4g.client.client.constant.DomIdConstant;
import com.smvp4g.mvp.client.core.view.AbstractView;
import com.smvp4g.mvp.client.core.view.annotation.View;

/**
 * The Class ContactUsView.
 *
 * @author Nguyen Duc Dung
 * @since 12/26/11, 11:28 AM
 */
@View(parentDomId = DomIdConstant.CONTENT_PANEL)
public class ContactUsView extends AbstractView {
    @Override
    protected void initializeView() {
        setWidget(new Anchor("dungvn3000@gmail.com","mailto:dungvn3000@gmail.com"));
    }
}
