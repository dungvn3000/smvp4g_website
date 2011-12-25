package com.smvp4g.client.client.module.main.presenter;

import com.smvp4g.client.client.module.main.view.BannerView;
import com.smvp4g.mvp.client.core.presenter.AbstractPresenter;
import com.smvp4g.mvp.client.core.presenter.annotation.Presenter;

/**
 * The Class BannerPresenter.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 11:07 AM
 */
@Presenter(view = BannerView.class)
public class BannerPresenter extends AbstractPresenter<BannerView> {
    @Override
    public void onActivate() {
        view.show();
    }
}
