package com.smvp4g.client.client.module.page.presenter;

import com.smvp4g.client.client.module.page.place.DocumentPlace;
import com.smvp4g.client.client.module.page.view.DocumentView;
import com.smvp4g.mvp.client.core.presenter.AbstractPresenter;
import com.smvp4g.mvp.client.core.presenter.annotation.Presenter;

/**
 * The Class DocumentPresenter.
 *
 * @author Nguyen Duc Dung
 * @since 12/26/11, 11:31 AM
 */
@Presenter(view = DocumentView.class, place = DocumentPlace.class)
public class DocumentPresenter extends AbstractPresenter<DocumentView> {
    @Override
    public void onActivate() {
        view.show();
    }
}
