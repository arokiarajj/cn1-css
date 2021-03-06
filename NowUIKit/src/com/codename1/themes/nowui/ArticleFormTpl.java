/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package com.codename1.themes.nowui;
import com.codename1.ui.plaf.UIManager;import com.codename1.ui.*;
import com.codename1.components.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;
class ArticleFormTpl {
private Container rootContainer;
private Resources resources;
public Container getRoot(){ if (rootContainer==null){ 
        try {rootContainer=buildUI();} catch (Exception ex){ex.printStackTrace();throw new RuntimeException(ex.getMessage());}} return rootContainer;}
private java.util.Map<String,Component> _nameIndex=new java.util.HashMap<String,Component>();
public Component get(String name){ getRoot(); return _nameIndex.get(name);}
private UIManager ui;
public ArticleFormTpl(java.util.Map context){
ui = (UIManager)context.get("ui");
for (Object o : context.values()){ if (o instanceof Resources) resources=(Resources)o;}
}
private Container buildUI() throws Exception {
Container root = new Container();
BoxLayout rootLayout = new BoxLayout(BoxLayout.Y_AXIS);
root.setLayout(rootLayout);
root.setUIID("NoPadding");
Container node1 = new Container();
LayeredLayout node1Layout = new LayeredLayout();
node1.setLayout(node1Layout);
node1.setUIID("NoPadding");
Label node2 = new Label();
node2.setUIID("NoPaddingLabel");
node2.setName("headerImage");
_nameIndex.put("headerImage", node2);
node2.setIcon(resources.getImage("SeaIce.png"));
if (node2.getClientProperty("__CN1ML_NO_ADD__") == null && node1 != node2.getParent()){
node1.addComponent(node2);
}
Container node3 = new Container();
BorderLayout node3Layout = new BorderLayout();
node3.setLayout(node3Layout);
SpanLabel node4 = new SpanLabel();
node4.setUIID("ArticleHeadline");
node4.setName("headline");
_nameIndex.put("headline", node4);
node4.setText("Arctic sea ice hits record low for winter maximum");
if (node4.getClientProperty("__CN1ML_NO_ADD__") == null && node3 != node4.getParent()){
node3.addComponent(BorderLayout.SOUTH, node4);
}
if (node3.getClientProperty("__CN1ML_NO_ADD__") == null && node1 != node3.getParent()){
node1.addComponent(node3);
}
if (node1.getClientProperty("__CN1ML_NO_ADD__") == null && root != node1.getParent()){
root.addComponent(node1);
}
Container node5 = new Container();
BorderLayout node5Layout = new BorderLayout();
node5.setLayout(node5Layout);
node5.setUIID("ArticleCommandArea");
Container node6 = new Container();
FlowLayout node6Layout = new FlowLayout();
node6.setLayout(node6Layout);
Button node7 = new Button();
node7.setUIID("NUIIconLinkButton");
node7.setName("sourceButton");
_nameIndex.put("sourceButton", node7);
node7.setText("CNN");
init1_node7(node7, node6);
if (node7.getClientProperty("__CN1ML_NO_ADD__") == null && node6 != node7.getParent()){
node6.addComponent(node7);
}
Button node8 = new Button();
node8.setUIID("NUIIconLinkButton");
node8.setName("dateButton");
_nameIndex.put("dateButton", node8);
node8.setText("Apr. 3, 2015");
if (node8.getClientProperty("__CN1ML_NO_ADD__") == null && node6 != node8.getParent()){
node6.addComponent(node8);
}
if (node6.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node6.getParent()){
node5.addComponent(BorderLayout.CENTER, node6);
}
Container node9 = new Container();
FlowLayout node9Layout = new FlowLayout();
node9.setLayout(node9Layout);
Button node10 = new Button();
node10.setUIID("NUICategoryButton");
node10.setName("categoryButton");
_nameIndex.put("categoryButton", node10);
node10.setText("ENVIRONMENT");
if (node10.getClientProperty("__CN1ML_NO_ADD__") == null && node9 != node10.getParent()){
node9.addComponent(node10);
}
if (node9.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node9.getParent()){
node5.addComponent(BorderLayout.EAST, node9);
}
if (node5.getClientProperty("__CN1ML_NO_ADD__") == null && root != node5.getParent()){
root.addComponent(node5);
}
com.codename1.components.xmlview.XMLView node11 = new com.codename1.components.xmlview.XMLView();
node11.setName("body");
_nameIndex.put("body", node11);
if (node11.getClientProperty("__CN1ML_NO_ADD__") == null && root != node11.getParent()){
root.addComponent(node11);
}
Container node12 = new Container();
BoxLayout node12Layout = new BoxLayout(BoxLayout.Y_AXIS);
node12.setLayout(node12Layout);
node12.setUIID("NUIArticleFooter");
Label node13 = new Label();
node13.setUIID("NUINextStoryLabel");
node13.setText("NEXT STORY");
if (node13.getClientProperty("__CN1ML_NO_ADD__") == null && node12 != node13.getParent()){
node12.addComponent(node13);
}
SpanLabel node14 = new SpanLabel();
node14.setUIID("NUINextStoryTitle");
node14.setName("nextStoryTitle");
_nameIndex.put("nextStoryTitle", node14);
node14.setText("New Battery for smartphones can be charged in a minute");
if (node14.getClientProperty("__CN1ML_NO_ADD__") == null && node12 != node14.getParent()){
node12.addComponent(node14);
}
Button node15 = new Button();
node15.setUIID("NUINextStoryLink");
node15.setName("nextStoryButton");
_nameIndex.put("nextStoryButton", node15);
node15.setIcon(resources.getImage("Arrow-right.png"));
node15.setText(" Next ");
if (node15.getClientProperty("__CN1ML_NO_ADD__") == null && node12 != node15.getParent()){
node12.addComponent(node15);
}
Container node16 = new Container();
FlowLayout node16Layout = new FlowLayout();
node16.setLayout(node16Layout);
node16.addComponent(new Label("Testing"));
if (node16.getClientProperty("__CN1ML_NO_ADD__") == null && node12 != node16.getParent()){
node12.addComponent(node16);
}
if (node12.getClientProperty("__CN1ML_NO_ADD__") == null && root != node12.getParent()){
root.addComponent(node12);
}
return root;
}
public Label getHeaderImage(){
      return (Label)get("headerImage");
      }
public SpanLabel getHeadline(){
      return (SpanLabel)get("headline");
      }
public Button getSourceButton(){
      return (Button)get("sourceButton");
      }
private void init1_node7(Button self, Container parent){
self.setIcon(ui.getThemeImageConstant("articleSourceIconImage"));

}
public Button getDateButton(){
      return (Button)get("dateButton");
      }
public Button getCategoryButton(){
      return (Button)get("categoryButton");
      }
public com.codename1.components.xmlview.XMLView getBody(){
      return (com.codename1.components.xmlview.XMLView)get("body");
      }
public SpanLabel getNextStoryTitle(){
      return (SpanLabel)get("nextStoryTitle");
      }
public Button getNextStoryButton(){
      return (Button)get("nextStoryButton");
      }
}