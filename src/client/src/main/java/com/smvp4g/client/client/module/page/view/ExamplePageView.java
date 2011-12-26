package com.smvp4g.client.client.module.page.view;

import com.google.gwt.user.client.ui.HTML;
import com.smvp4g.client.client.constant.DomIdConstant;
import com.smvp4g.mvp.client.core.view.AbstractView;
import com.smvp4g.mvp.client.core.view.annotation.View;

/**
 * The Class ExamplePageView.
 *
 * @author Nguyen Duc Dung
 * @since 12/25/11, 2:11 PM
 */
@View(parentDomId = DomIdConstant.CONTENT_PANEL)
public class ExamplePageView extends AbstractView {
    @Override
    protected void initializeView() {
        HTML html = new HTML(
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
                "\t@Place(defaultPlace = true)\n" +
                "\tpublic class TestPlace extends AbstractPlace {\n" +
                "\t}\n" +
                "</pre>"
        );
        setWidget(html);
    }
}
