/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package com.codename1.themes.nowui;
import com.codename1.ui.plaf.UIManager;import com.codename1.ui.*;
import com.codename1.components.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;
class ArticleListFormTpl {
private Container rootContainer;
private Resources resources;
public Container getRoot(){ if (rootContainer==null){ 
        try {rootContainer=buildUI();} catch (Exception ex){ex.printStackTrace();throw new RuntimeException(ex.getMessage());}} return rootContainer;}
private java.util.Map<String,Component> _nameIndex=new java.util.HashMap<String,Component>();
public Component get(String name){ getRoot(); return _nameIndex.get(name);}
private UIManager ui;
public ArticleListFormTpl(java.util.Map context){
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
Container node2 = new Container();
BoxLayout node2Layout = new BoxLayout(BoxLayout.Y_AXIS);
node2.setLayout(node2Layout);
node2.setUIID("NoPadding");
Label node3 = new Label();
node3.setUIID("NoPaddingLabel");
node3.setIcon(resources.getImage("RedPlanet.png"));
if (node3.getClientProperty("__CN1ML_NO_ADD__") == null && node2 != node3.getParent()){
node2.addComponent(node3);
}
if (node2.getClientProperty("__CN1ML_NO_ADD__") == null && node1 != node2.getParent()){
node1.addComponent(node2);
}
Container node4 = new Container();
BorderLayout node4Layout = new BorderLayout();
node4.setLayout(node4Layout);
node4.setUIID("NoPadding");
Container node5 = new Container();
BoxLayout node5Layout = new BoxLayout(BoxLayout.Y_AXIS);
node5.setLayout(node5Layout);
node5.setUIID("NoPadding");
SpanLabel node6 = new SpanLabel();
node6.setUIID("ArticleHeadline");
node6.setText("Astronauts could land on Red Planet by 2039");
init1_node6(node6, node5);
if (node6.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node6.getParent()){
node5.addComponent(node6);
}
Container node7 = new Container();
BorderLayout node7Layout = new BorderLayout();
node7.setLayout(node7Layout);
node7.setUIID("ArticleCommandArea");
Container node8 = new Container();
FlowLayout node8Layout = new FlowLayout();
node8.setLayout(node8Layout);
Button node9 = new Button();
node9.setUIID("NUISourceButton50White");
node9.setName("sourceButton");
_nameIndex.put("sourceButton", node9);
node9.setText("SPACE.com");
if (node9.getClientProperty("__CN1ML_NO_ADD__") == null && node8 != node9.getParent()){
node8.addComponent(node9);
}
Button node10 = new Button();
node10.setUIID("NUIDateButton50White");
node10.setName("dateButton");
_nameIndex.put("dateButton", node10);
node10.setText("20m ago");
if (node10.getClientProperty("__CN1ML_NO_ADD__") == null && node8 != node10.getParent()){
node8.addComponent(node10);
}
if (node8.getClientProperty("__CN1ML_NO_ADD__") == null && node7 != node8.getParent()){
node7.addComponent(BorderLayout.WEST, node8);
}
Container node11 = new Container();
FlowLayout node11Layout = new FlowLayout();
node11.setLayout(node11Layout);
Button node12 = new Button();
node12.setUIID("NUICategoryButtonLight");
node12.setName("categoryButton");
_nameIndex.put("categoryButton", node12);
node12.setText("SCIENCE");
if (node12.getClientProperty("__CN1ML_NO_ADD__") == null && node11 != node12.getParent()){
node11.addComponent(node12);
}
if (node11.getClientProperty("__CN1ML_NO_ADD__") == null && node7 != node11.getParent()){
node7.addComponent(BorderLayout.EAST, node11);
}
if (node7.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node7.getParent()){
node5.addComponent(node7);
}
if (node5.getClientProperty("__CN1ML_NO_ADD__") == null && node4 != node5.getParent()){
node4.addComponent(BorderLayout.SOUTH, node5);
}
if (node4.getClientProperty("__CN1ML_NO_ADD__") == null && node1 != node4.getParent()){
node1.addComponent(node4);
}
if (node1.getClientProperty("__CN1ML_NO_ADD__") == null && root != node1.getParent()){
root.addComponent(node1);
}
Container node13 = new Container();
BoxLayout node13Layout = new BoxLayout(BoxLayout.Y_AXIS);
node13.setLayout(node13Layout);
node13.setName("articleList");
_nameIndex.put("articleList", node13);
Container node14 = new Container();
BoxLayout node14Layout = new BoxLayout(BoxLayout.Y_AXIS);
node14.setLayout(node14Layout);
node14.setUIID("ArticleListItem");
SpanLabel node15 = new SpanLabel();
node15.setText("Arctic sea ice extent hits record low for winter maximum");
if (node15.getClientProperty("__CN1ML_NO_ADD__") == null && node14 != node15.getParent()){
node14.addComponent(node15);
}
Container node16 = new Container();
BorderLayout node16Layout = new BorderLayout();
node16.setLayout(node16Layout);
node16.setUIID("ArticleCommandArea");
Container node17 = new Container();
FlowLayout node17Layout = new FlowLayout();
node17.setLayout(node17Layout);
Button node18 = new Button();
node18.setUIID("NUISourceButton30");
node18.setName("sourceButton_1");
_nameIndex.put("sourceButton_1", node18);
node18.setText("CNN");
if (node18.getClientProperty("__CN1ML_NO_ADD__") == null && node17 != node18.getParent()){
node17.addComponent(node18);
}
Button node19 = new Button();
node19.setUIID("NUIDateButton30");
node19.setName("dateButton_1");
_nameIndex.put("dateButton_1", node19);
node19.setText("1h ago");
if (node19.getClientProperty("__CN1ML_NO_ADD__") == null && node17 != node19.getParent()){
node17.addComponent(node19);
}
if (node17.getClientProperty("__CN1ML_NO_ADD__") == null && node16 != node17.getParent()){
node16.addComponent(BorderLayout.WEST, node17);
}
Container node20 = new Container();
FlowLayout node20Layout = new FlowLayout();
node20.setLayout(node20Layout);
Button node21 = new Button();
node21.setUIID("NUICategoryButton");
node21.setName("categoryButton_1");
_nameIndex.put("categoryButton_1", node21);
node21.setText("ENVIRONMENT");
if (node21.getClientProperty("__CN1ML_NO_ADD__") == null && node20 != node21.getParent()){
node20.addComponent(node21);
}
if (node20.getClientProperty("__CN1ML_NO_ADD__") == null && node16 != node20.getParent()){
node16.addComponent(BorderLayout.EAST, node20);
}
if (node16.getClientProperty("__CN1ML_NO_ADD__") == null && node14 != node16.getParent()){
node14.addComponent(node16);
}
if (node14.getClientProperty("__CN1ML_NO_ADD__") == null && node13 != node14.getParent()){
node13.addComponent(node14);
}
Container node22 = new Container();
BoxLayout node22Layout = new BoxLayout(BoxLayout.Y_AXIS);
node22.setLayout(node22Layout);
node22.setUIID("ArticleListItem");
SpanLabel node23 = new SpanLabel();
node23.setText("New battery for smart phones can be charged in a minute");
if (node23.getClientProperty("__CN1ML_NO_ADD__") == null && node22 != node23.getParent()){
node22.addComponent(node23);
}
Container node24 = new Container();
BorderLayout node24Layout = new BorderLayout();
node24.setLayout(node24Layout);
node24.setUIID("ArticleCommandArea");
Container node25 = new Container();
FlowLayout node25Layout = new FlowLayout();
node25.setLayout(node25Layout);
Button node26 = new Button();
node26.setUIID("NUISourceButton30");
node26.setName("sourceButton_2");
_nameIndex.put("sourceButton_2", node26);
node26.setText("Reuters");
if (node26.getClientProperty("__CN1ML_NO_ADD__") == null && node25 != node26.getParent()){
node25.addComponent(node26);
}
Button node27 = new Button();
node27.setUIID("NUIDateButton30");
node27.setName("dateButton_2");
_nameIndex.put("dateButton_2", node27);
node27.setText("6h ago");
if (node27.getClientProperty("__CN1ML_NO_ADD__") == null && node25 != node27.getParent()){
node25.addComponent(node27);
}
if (node25.getClientProperty("__CN1ML_NO_ADD__") == null && node24 != node25.getParent()){
node24.addComponent(BorderLayout.WEST, node25);
}
Container node28 = new Container();
FlowLayout node28Layout = new FlowLayout();
node28.setLayout(node28Layout);
Button node29 = new Button();
node29.setUIID("NUICategoryButton");
node29.setName("categoryButton_2");
_nameIndex.put("categoryButton_2", node29);
node29.setText("TECHNOLOGY");
if (node29.getClientProperty("__CN1ML_NO_ADD__") == null && node28 != node29.getParent()){
node28.addComponent(node29);
}
if (node28.getClientProperty("__CN1ML_NO_ADD__") == null && node24 != node28.getParent()){
node24.addComponent(BorderLayout.EAST, node28);
}
if (node24.getClientProperty("__CN1ML_NO_ADD__") == null && node22 != node24.getParent()){
node22.addComponent(node24);
}
if (node22.getClientProperty("__CN1ML_NO_ADD__") == null && node13 != node22.getParent()){
node13.addComponent(node22);
}
if (node13.getClientProperty("__CN1ML_NO_ADD__") == null && root != node13.getParent()){
root.addComponent(node13);
}
init2_root(root, null);
return root;
}
private void init1_node6(SpanLabel self, Container parent){
self.setTextUIID("ArticleHeadlineText");

}
public Button getSourceButton(){
      return (Button)get("sourceButton");
      }
public Button getDateButton(){
      return (Button)get("dateButton");
      }
public Button getCategoryButton(){
      return (Button)get("categoryButton");
      }
public Container getArticleList(){
      return (Container)get("articleList");
      }
public Button getSourceButton_1(){
      return (Button)get("sourceButton_1");
      }
public Button getDateButton_1(){
      return (Button)get("dateButton_1");
      }
public Button getCategoryButton_1(){
      return (Button)get("categoryButton_1");
      }
public Button getSourceButton_2(){
      return (Button)get("sourceButton_2");
      }
public Button getDateButton_2(){
      return (Button)get("dateButton_2");
      }
public Button getCategoryButton_2(){
      return (Button)get("categoryButton_2");
      }
private void init2_root(Container self, Container parent){
self.setScrollableY(true);

}
}