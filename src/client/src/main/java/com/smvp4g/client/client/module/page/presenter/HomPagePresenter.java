package com.smvp4g.client.client.module.page.presenter;

import com.smvp4g.client.client.module.page.place.HomePagePlace;
import com.smvp4g.client.client.module.page.view.HomePageView;
import com.smvp4g.mvp.client.core.presenter.AbstractPresenter;
import com.smvp4g.mvp.client.core.presenter.annotation.Presenter;

/**
 * The Class HomPagePresenter.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 11:08 AM
 */
@Presenter(view = HomePageView.class, place = HomePagePlace.class)
public class HomPagePresenter extends AbstractPresenter<HomePageView> {
    @Override
    public void onActivate() {
        view.show();
    }
}
