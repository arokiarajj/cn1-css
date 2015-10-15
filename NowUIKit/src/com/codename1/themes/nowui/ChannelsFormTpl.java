/* THIS FILE IS AUTOMATICALLY GENERATED-- DO NOT MODIFY IT*/
package com.codename1.themes.nowui;
import com.codename1.ui.*;
import com.codename1.components.*;
import com.codename1.ui.layouts.*;
import com.codename1.ui.table.*;
import com.codename1.ui.util.*;
class ChannelsFormTpl {
private Container rootContainer;
private Resources resources;
public Container getRoot(){ if (rootContainer==null){ 
        try {rootContainer=buildUI();} catch (Exception ex){ex.printStackTrace();throw new RuntimeException(ex.getMessage());}} return rootContainer;}
private java.util.Map<String,Component> _nameIndex=new java.util.HashMap<String,Component>();
public Component get(String name){ getRoot(); return _nameIndex.get(name);}
public ChannelsFormTpl(java.util.Map context){
for (Object o : context.values()){ if (o instanceof Resources) resources=(Resources)o;}
}
private Container buildUI() throws Exception {
Container root = new Container();
BorderLayout rootLayout = new BorderLayout();
root.setLayout(rootLayout);
root.setUIID("NoPadding");
Container node1 = new Container();
GridLayout node1Layout = new GridLayout(1,3);
node1.setLayout(node1Layout);
node1.setUIID("NUINorthMenu");
Button node2 = new Button();
node2.setUIID("FilterButtonSelected");
node2.setName("followingButton");
_nameIndex.put("followingButton", node2);
node2.setText("Following");
if (node2.getClientProperty("__CN1ML_NO_ADD__") == null && node1 != node2.getParent()){
node1.addComponent(node2);
}
Button node3 = new Button();
node3.setUIID("FilterButton");
node3.setName("newestButton");
_nameIndex.put("newestButton", node3);
node3.setText("Newest");
if (node3.getClientProperty("__CN1ML_NO_ADD__") == null && node1 != node3.getParent()){
node1.addComponent(node3);
}
Button node4 = new Button();
node4.setUIID("FilterButton");
node4.setName("exploreButton");
_nameIndex.put("exploreButton", node4);
node4.setText("Explore");
if (node4.getClientProperty("__CN1ML_NO_ADD__") == null && node1 != node4.getParent()){
node1.addComponent(node4);
}
if (node1.getClientProperty("__CN1ML_NO_ADD__") == null && root != node1.getParent()){
root.addComponent(BorderLayout.NORTH, node1);
}
Container node5 = new Container();
GridLayout node5Layout = new GridLayout(3,2);
node5.setLayout(node5Layout);
node5.setUIID("NoPadding");
ChannelButton node6 = new ChannelButton();
node6.setUIID("FashionButton");
Button node7 = new Button();
node7.setUIID("ChannelInternalButton");
node7.setName("fashionButton");
_nameIndex.put("fashionButton", node7);
node7.setText("FASHION");
if (node7.getClientProperty("__CN1ML_NO_ADD__") == null && node6 != node7.getParent()){
node6.addComponent(node7);
}
if (node6.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node6.getParent()){
node5.addComponent(node6);
}
ChannelButton node8 = new ChannelButton();
node8.setUIID("ScienceButton");
Button node9 = new Button();
node9.setUIID("ChannelInternalButton");
node9.setName("scienceButton");
_nameIndex.put("scienceButton", node9);
node9.setText("SCIENCE");
if (node9.getClientProperty("__CN1ML_NO_ADD__") == null && node8 != node9.getParent()){
node8.addComponent(node9);
}
if (node8.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node8.getParent()){
node5.addComponent(node8);
}
ChannelButton node10 = new ChannelButton();
node10.setUIID("AutoButton");
Button node11 = new Button();
node11.setUIID("ChannelInternalButton");
node11.setName("autoButton");
_nameIndex.put("autoButton", node11);
node11.setText("AUTO");
if (node11.getClientProperty("__CN1ML_NO_ADD__") == null && node10 != node11.getParent()){
node10.addComponent(node11);
}
if (node10.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node10.getParent()){
node5.addComponent(node10);
}
ChannelButton node12 = new ChannelButton();
node12.setUIID("TechnologyButton");
Button node13 = new Button();
node13.setUIID("ChannelInternalButton");
node13.setName("technologyButton");
_nameIndex.put("technologyButton", node13);
node13.setText("TECHNOLOGY");
if (node13.getClientProperty("__CN1ML_NO_ADD__") == null && node12 != node13.getParent()){
node12.addComponent(node13);
}
if (node12.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node12.getParent()){
node5.addComponent(node12);
}
ChannelButton node14 = new ChannelButton();
node14.setUIID("EnvironmentButton");
Button node15 = new Button();
node15.setUIID("ChannelInternalButton");
node15.setName("environmentButton");
_nameIndex.put("environmentButton", node15);
node15.setText("ENVIRONMENT");
if (node15.getClientProperty("__CN1ML_NO_ADD__") == null && node14 != node15.getParent()){
node14.addComponent(node15);
}
if (node14.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node14.getParent()){
node5.addComponent(node14);
}
ChannelButton node16 = new ChannelButton();
node16.setUIID("FinancesButton");
Button node17 = new Button();
node17.setUIID("ChannelInternalButton");
node17.setName("financesButton");
_nameIndex.put("financesButton", node17);
node17.setText("FINANCES");
if (node17.getClientProperty("__CN1ML_NO_ADD__") == null && node16 != node17.getParent()){
node16.addComponent(node17);
}
if (node16.getClientProperty("__CN1ML_NO_ADD__") == null && node5 != node16.getParent()){
node5.addComponent(node16);
}
if (node5.getClientProperty("__CN1ML_NO_ADD__") == null && root != node5.getParent()){
root.addComponent(BorderLayout.CENTER, node5);
}
return root;
}
public Button getFollowingButton(){
      return (Button)get("followingButton");
      }
public Button getNewestButton(){
      return (Button)get("newestButton");
      }
public Button getExploreButton(){
      return (Button)get("exploreButton");
      }
public Button getFashionButton(){
      return (Button)get("fashionButton");
      }
public Button getScienceButton(){
      return (Button)get("scienceButton");
      }
public Button getAutoButton(){
      return (Button)get("autoButton");
      }
public Button getTechnologyButton(){
      return (Button)get("technologyButton");
      }
public Button getEnvironmentButton(){
      return (Button)get("environmentButton");
      }
public Button getFinancesButton(){
      return (Button)get("financesButton");
      }
}