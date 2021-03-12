package com.company.planner.screen.talk;

import io.jmix.ui.screen.*;
import com.company.planner.entity.Talk;

@UiController("plnnr_Talk.browse")
@UiDescriptor("talk-browse.xml")
@LookupComponent("talksTable")
public class TalkBrowse extends StandardLookup<Talk> {
}