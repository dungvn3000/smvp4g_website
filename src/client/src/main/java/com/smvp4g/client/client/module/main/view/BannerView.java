package com.smvp4g.client.client.module.main.view;

import com.google.gwt.user.client.ui.HTML;
import com.smvp4g.client.client.constant.DomIdConstant;
import com.smvp4g.mvp.client.core.view.AbstractView;
import com.smvp4g.mvp.client.core.view.annotation.View;

/**
 * The Class BannerView.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 10:54 AM
 */
@View(parentDomId = DomIdConstant.BANNER_PANEL)
public class BannerView extends AbstractView {
    @Override
    protected void initializeView() {
        HTML html = new HTML("<h1 style='text-align:center;color:#CFCDC6'>Slim and Simple MVP Framework for GWT</h1>");
        setWidget(html);
    }
}
