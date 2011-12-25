package com.smvp4g.client.client.module.main.presenter;

import com.smvp4g.client.client.module.main.view.MainMenuView;
import com.smvp4g.mvp.client.core.presenter.AbstractPresenter;
import com.smvp4g.mvp.client.core.presenter.annotation.Presenter;

/**
 * The Class MainMenuPresenter.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 11:08 AM
 */
@Presenter(view = MainMenuView.class)
public class MainMenuPresenter extends AbstractPresenter<MainMenuView> {
    @Override
    public void onActivate() {
        view.show();
    }
}
