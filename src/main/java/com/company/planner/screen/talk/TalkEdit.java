package com.company.planner.screen.talk;

import io.jmix.core.common.event.Subscription;
import io.jmix.ui.screen.*;
import com.company.planner.entity.Talk;

import java.util.function.Consumer;

@UiController("plnnr_Talk.edit")
@UiDescriptor("talk-edit.xml")
@EditedEntityContainer("talkDc")
public class TalkEdit extends StandardEditor<Talk> {

    //todo на что влияет имя обработчика?
    @Subscribe
    public void onInitEntity(InitEntityEvent<Talk> event) {
        event.getEntity().setDuration(1);
    }

}