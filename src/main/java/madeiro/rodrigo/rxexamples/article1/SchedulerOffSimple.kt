package madeiro.rodrigo.rxexamples.article1

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class SchedulerOffSimple {
    companion object{

        @JvmStatic
        fun main(args: Array<String>) {

            val a = Observable.range(1, 5)
            val b = Observable.range(6, 5)


            val observer = object: Observer<Int>{
                override fun onComplete() {}
                override fun onSubscribe(d: Disposable?) {}
                override fun onNext(n: Int) {
                    println(n)
                }
                override fun onError(e: Throwable?) {}
            }

            a.subscribe(observer)
            b.subscribe(observer)
        }
    }
}