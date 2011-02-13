package org.gtpsiu.brometheus.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SearchPanel extends Composite {
	
	private TextBox titleField;
	private TextBox course;
	
	public SearchPanel() {
		HorizontalPanel container = new HorizontalPanel();
		initWidget(container);
		
		Label titleLabel = new Label("Title Field");
		Label courseLabel = new Label("Course Field");
		
		titleField = new TextBox();
		course = new TextBox();
		
		VerticalPanel labels = new VerticalPanel();
		labels.add(titleLabel);
		labels.add(courseLabel);
		container.add(labels);
		
		VerticalPanel fields = new VerticalPanel();
		fields.add(titleField);
		fields.add(course);
		container.add(fields);
	}
	 

}
