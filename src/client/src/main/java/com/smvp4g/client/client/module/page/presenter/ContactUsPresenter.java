package com.smvp4g.client.client.module.page.presenter;

import com.smvp4g.client.client.module.page.place.ContactUsPlace;
import com.smvp4g.client.client.module.page.view.ContactUsView;
import com.smvp4g.mvp.client.core.presenter.AbstractPresenter;
import com.smvp4g.mvp.client.core.presenter.annotation.Presenter;

/**
 * The Class ContactUsPresenter.
 *
 * @author Nguyen Duc Dung
 * @since 12/26/11, 11:29 AM
 */
@Presenter(view = ContactUsView.class, place = ContactUsPlace.class)
public class ContactUsPresenter extends AbstractPresenter<ContactUsView> {
    @Override
    public void onActivate() {
        view.show();
    }
}
