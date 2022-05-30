package demo

import java.sql.DriverManager.println


fun main() {
   // UnitOne().addLisenter()
    UnitOne().addLisenter(Parent())
}

class UnitOne {

    fun addLisenter(iCommentClick: Parent) {
        //this.iCommentClick =iCommentClick
        if (iCommentClick is Parent) {
            println("Parent")
        }
    }

}


class Child : ViewItemClickListener3<GameChatInfo> {
    override fun onChangeTopSort(type: Int) {
        TODO("Not yet implemented")
    }

    override fun onClickLike(itemBo: GameChatInfo, callBack: ICommentClick.EventNotify?) {
        TODO("Not yet implemented")
       // callBack?.respondSuccess()
    }

    override fun onClickProfile(itemBo: GameChatInfo, callBack: ICommentClick.EventNotify?) {
        TODO("Not yet implemented")
    }

    override fun onClickContainer(itemBo: GameChatInfo, callBack: ICommentClick.EventNotify?) {
        TODO("Not yet implemented")
    }

    override fun onClickMore(itemBo: GameChatInfo, callBack: ICommentClick.EventNotify?) {
        TODO("Not yet implemented")
    }

}

class Parent : ViewItemClickListener2<ChatReplyItemInfo> {
    override fun onChangeTopSort(type: Int) {
        TODO("Not yet implemented")
    }

    override fun onClickReadMore(t: ChatReplyItemInfo, call: ICommentClick.EventNotify) {
        TODO("Not yet implemented")
    }

    override fun onClickLike(itemBo: ChatReplyItemInfo, callBack: ICommentClick.EventNotify?) {
        TODO("Not yet implemented")
    }

    override fun onClickProfile(
        itemBo: ChatReplyItemInfo,
        callBack: ICommentClick.EventNotify?
    ) {
        TODO("Not yet implemented")
    }

    override fun onClickContainer(
        itemBo: ChatReplyItemInfo,
        callBack: ICommentClick.EventNotify?
    ) {
        TODO("Not yet implemented")
    }

    override fun onClickMore(itemBo: ChatReplyItemInfo, callBack: ICommentClick.EventNotify?) {
        TODO("Not yet implemented")
    }

}

data class ChatReplyItemInfo(val name: String)
data class GameChatInfo(val name: String)


interface ViewItemClickListener2<T> : ICommentClick<T> {
    fun onChangeTopSort(type: Int)
    fun onClickReadMore(t: T, call: ICommentClick.EventNotify)
}

interface ViewItemClickListener3<T> : ICommentClick<T> {
    fun onChangeTopSort(type: Int)
    // fun onClickReadMore(t: T, call: ICommentClick.EventNotify)
}


interface ICommentClick<T> : God {
    fun onClickLike(itemBo: T, callBack: EventNotify?)
    fun onClickProfile(itemBo: T, callBack: EventNotify?)
    fun onClickContainer(itemBo: T, callBack: EventNotify?)
    fun onClickMore(itemBo: T, callBack: EventNotify?)
    interface EventNotify {
        fun respondSuccess(bundle: String?)
    }
}

interface God {

}