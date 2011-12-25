package com.smvp4g.client.client.module.page.presenter;

import com.smvp4g.client.client.module.page.place.ExamplePagePlace;
import com.smvp4g.client.client.module.page.view.ExamplePageView;
import com.smvp4g.mvp.client.core.presenter.AbstractPresenter;
import com.smvp4g.mvp.client.core.presenter.annotation.Presenter;

/**
 * The Class ExamplePagePresenter.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 2:17 PM
 */
@Presenter(view = ExamplePageView.class, place = ExamplePagePlace.class)
public class ExamplePagePresenter extends AbstractPresenter<ExamplePageView> {
    @Override
    public void onActivate() {
        view.show();
    }
}
