package com.smvp4g.client.client.module.main.view;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.smvp4g.client.client.constant.DomIdConstant;
import com.smvp4g.mvp.client.core.view.AbstractView;
import com.smvp4g.mvp.client.core.view.annotation.View;

/**
 * The Class HomePageView.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 11:03 AM
 */
@View(parentDomId = DomIdConstant.CONTENT_PANEL)
public class HomePageView extends AbstractView {
    @Override
    protected void initializeView() {
        HTML html = new HTML(
                "<h2>SMVP4G Feature</h2>\n" +
                "<p>Support MVP</p>\n" +
                "<p>Easy Using I18n</p>\n" +
                "<p>Support set user permission for views</p>\n" +
                "<p>Support set user permission for each filed in a view</p>\n" +
                "<p>Support Reflection</p>\n" +
                "<p>Support Aop</p>\n" +
                "<br>\n" +
                "<h2>Example</h2>\n" +
                "<p><b>View</b></p>\n" +
                "<pre>\n" +
                "\t@View\n" +
                "\tpublic class TestView extends AbstractView {\n" +
                "\t    @Override\n" +
                "\t    protected void initializeView() {\n" +
                "\t        setWidget(new Label(\"Main Test View\"));\n" +
                "\t    }\n" +
                "\t}\n" +
                "</pre>\n" +
                "<br>\n" +
                "<p><b>Presenter</b></p>\n" +
                "<pre>\n" +
                "\t@Presenter(view = TestView.class, place = TestPlace.class)\n" +
                "\tpublic class TestPresenter extends AbstractPresenter<TestView> {\n" +
                "\t    @Override\n" +
                "\t    public void onActivate() {\n" +
                "\t        view.show();\n" +
                "\t    }\n" +
                "\t}\n" +
                "</pre>\n" +
                "<br>\n" +
                "<p><b>Place</b></p>\n" +
                "<pre>\n" +
                "\t@Place\n" +
                "\tpublic class TestPlace extends AbstractPlace {\n" +
                "\t}\n" +
                "</pre>"
        );
        setWidget(html);
        setHeight("800px");
    }
}
