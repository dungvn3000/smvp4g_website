package com.smvp4g.client.client.module.main.presenter;

import com.smvp4g.client.client.module.main.view.CopyRightView;
import com.smvp4g.mvp.client.core.presenter.AbstractPresenter;
import com.smvp4g.mvp.client.core.presenter.annotation.Presenter;
import com.smvp4g.mvp.client.core.view.AbstractView;

/**
 * The Class CopyrightPresenter.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 11:39 AM
 */
@Presenter(view = CopyRightView.class)
public class CopyrightPresenter extends AbstractPresenter<CopyRightView> {
    @Override
    public void onActivate() {
        view.show();
    }
}
