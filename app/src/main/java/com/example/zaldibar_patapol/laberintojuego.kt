package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class laberintojuego : AppCompatActivity() {


    private lateinit var berriro: Button

    private lateinit var arriba: ImageButton
    private lateinit var abajo: ImageButton
    private lateinit var derecha: ImageButton
    private lateinit var izquierda: ImageButton
    private lateinit var a: ImageView
    private lateinit var b: ImageView
    private lateinit var c: ImageView
    private lateinit var d: ImageView
    private lateinit var e: ImageView
    private lateinit var f: ImageView
    private lateinit var g: ImageView
    private lateinit var h: ImageView
    private lateinit var i: ImageView
    private lateinit var j: ImageView
    private lateinit var k: ImageView
    private lateinit var l: ImageView
    private lateinit var m: ImageView
    private lateinit var n: ImageView
    private lateinit var nn: ImageView
    private lateinit var o: ImageView
    private lateinit var p: ImageView
    private lateinit var q: ImageView
    private lateinit var j2: ImageView
    private lateinit var j3: ImageView
    private lateinit var j4: ImageView
    private lateinit var j5: ImageView
    private lateinit var g2: ImageView
    private lateinit var g3: ImageView
    private lateinit var g4: ImageView
    private lateinit var g5: ImageView
    private lateinit var g6: ImageView
    private lateinit var g7: ImageView
    private lateinit var g8: ImageView
    private lateinit var g9: ImageView
    private lateinit var g10: ImageView
    private lateinit var o2: ImageView
    private lateinit var o3: ImageView
    private lateinit var o4: ImageView
    private lateinit var o5: ImageView
    private lateinit var o6: ImageView
    private lateinit var o7: ImageView
    private lateinit var a2: ImageView
    private lateinit var a3: ImageView
    private lateinit var a4: ImageView
    private lateinit var a5: ImageView
    private lateinit var a6: ImageView
    private lateinit var b2: ImageView
    private lateinit var b3: ImageView
    private lateinit var b4: ImageView
    private lateinit var b5: ImageView
    private lateinit var b6: ImageView
    private lateinit var c2: ImageView
    private lateinit var c3: ImageView
    private lateinit var d2: ImageView
    private lateinit var d3: ImageView
    private lateinit var d4: ImageView
    private lateinit var d5: ImageView
    private lateinit var d6: ImageView
    private lateinit var d7: ImageView
    private lateinit var n2: ImageView
    private lateinit var n3: ImageView
    private lateinit var n4: ImageView
    private lateinit var n5: ImageView
    private lateinit var n6: ImageView
    private lateinit var n7: ImageView
    private lateinit var n8: ImageView
    private lateinit var n9: ImageView
    private lateinit var n10: ImageView
    private lateinit var i2: ImageView
    private lateinit var i3: ImageView
    private lateinit var i4: ImageView
    private lateinit var i5: ImageView
    private lateinit var i6: ImageView
    private lateinit var h2: ImageView
    private lateinit var h3: ImageView
    private lateinit var h4: ImageView
    private lateinit var h6: ImageView
    private lateinit var h7: ImageView
    private lateinit var h8: ImageView
    private lateinit var h9: ImageView
    private lateinit var h10: ImageView
    private lateinit var h11: ImageView
    private lateinit var h12: ImageView
    private lateinit var f2: ImageView
    private lateinit var f3: ImageView
    private lateinit var f4: ImageView
    private lateinit var f5: ImageView
    private lateinit var f6: ImageView
    private lateinit var f7: ImageView
    private lateinit var f8: ImageView
    private lateinit var f9: ImageView
    private lateinit var f11: ImageView
    private lateinit var f12: ImageView
    private lateinit var f13: ImageView
    private lateinit var f14: ImageView
    private lateinit var f15: ImageView
    private lateinit var f16: ImageView
    private lateinit var f17: ImageView
    private lateinit var f18: ImageView
    private lateinit var f19: ImageView
    private lateinit var f20: ImageView
    private lateinit var f21: ImageView
    private lateinit var f22: ImageView
    private lateinit var f23: ImageView
    private lateinit var p2: ImageView
    private lateinit var p3: ImageView
    private lateinit var p4: ImageView
    private lateinit var p5: ImageView
    private lateinit var p7: ImageView
    private lateinit var p8: ImageView
    private lateinit var p9: ImageView
    private lateinit var p11: ImageView
    private lateinit var p12: ImageView
    private lateinit var p14: ImageView
    private lateinit var p16: ImageView
    private lateinit var p18: ImageView
    private lateinit var p19: ImageView
    private lateinit var l2: ImageView
    private lateinit var l3: ImageView
    private lateinit var l4: ImageView
    private lateinit var l5: ImageView
    private lateinit var l7: ImageView
    private lateinit var l8: ImageView
    private lateinit var l9: ImageView
    private lateinit var l10: ImageView
    private lateinit var l12: ImageView
    private lateinit var l13: ImageView
    private lateinit var l14: ImageView
    private lateinit var l15: ImageView
    private lateinit var l16: ImageView
    private lateinit var l17: ImageView
    private lateinit var l18: ImageView
    private lateinit var l20: ImageView
    private lateinit var l21: ImageView
    private lateinit var l22: ImageView
    private lateinit var l23: ImageView
    private lateinit var l24: ImageView
    private lateinit var l25: ImageView
    private lateinit var m2: ImageView
    private lateinit var m3: ImageView
    private lateinit var m4: ImageView
    private lateinit var m5: ImageView
    private lateinit var m6: ImageView
    private lateinit var m7: ImageView
    private lateinit var m8: ImageView
    private lateinit var m9: ImageView
    private lateinit var m11: ImageView
    private lateinit var m12: ImageView
    private lateinit var m13: ImageView
    private lateinit var m15: ImageView
    private lateinit var m16: ImageView
    private lateinit var m17: ImageView
    private lateinit var m18: ImageView
    private lateinit var m19: ImageView
    private lateinit var m20: ImageView
    private lateinit var m21: ImageView
    private lateinit var m22: ImageView
    private lateinit var m23: ImageView
    private lateinit var m24: ImageView
    private lateinit var m25: ImageView
    private lateinit var m26: ImageView
    private lateinit var m28: ImageView
    private lateinit var m29: ImageView
    private lateinit var m30: ImageView
    private lateinit var m31: ImageView
    private lateinit var m32: ImageView
    private lateinit var m33: ImageView
    private lateinit var m34: ImageView
    private lateinit var m35: ImageView
    private lateinit var mediaplayer: MediaPlayer

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laberintojuego)

        try {
            val fragment = navegador_superior()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmento2, fragment)
            transaction.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        arriba = findViewById(R.id.arriba)
        abajo = findViewById(R.id.abajo)
        derecha = findViewById(R.id.derecha)
        izquierda = findViewById(R.id.izquierda)

        berriro = findViewById<Button>(R.id.berriro)

        mediaplayer = MediaPlayer.create(this, R.raw.aplausos)


        a = findViewById(R.id.a)
        b = findViewById(R.id.b)
        c = findViewById(R.id.c)
        d = findViewById(R.id.d)
        e = findViewById(R.id.e)
        f = findViewById(R.id.f)
        g = findViewById(R.id.g)
        h = findViewById(R.id.h)
        i = findViewById(R.id.i)
        j = findViewById(R.id.j)
        k = findViewById(R.id.k)
        l = findViewById(R.id.l)
        m = findViewById(R.id.m)
        n = findViewById(R.id.n)
        nn = findViewById(R.id.nn)
        o = findViewById(R.id.o)
        p = findViewById(R.id.p)
        q = findViewById(R.id.q)
        j2 = findViewById(R.id.j2)
        j3 = findViewById(R.id.j3)
        j4 = findViewById(R.id.j4)
        j5 = findViewById(R.id.j5)
        g2 = findViewById(R.id.g2)
        g3 = findViewById(R.id.g3)
        g4 = findViewById(R.id.g4)
        g5 = findViewById(R.id.g5)
        g6 = findViewById(R.id.g6)
        g7 = findViewById(R.id.g7)
        g8 = findViewById(R.id.g8)
        g9 = findViewById(R.id.g9)
        g10 = findViewById(R.id.g10)
        o2 = findViewById(R.id.o2)
        o3 = findViewById(R.id.o3)
        o4 = findViewById(R.id.o4)
        o5 = findViewById(R.id.o5)
        o6 = findViewById(R.id.o6)
        o7 = findViewById(R.id.o7)
        a2 = findViewById(R.id.a2)
        a3 = findViewById(R.id.a3)
        a4 = findViewById(R.id.a4)
        a5 = findViewById(R.id.a5)
        a6 = findViewById(R.id.a6)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        c2 = findViewById(R.id.c2)
        c3 = findViewById(R.id.c1)
        d2 = findViewById(R.id.d2)
        d3 = findViewById(R.id.d3)
        d4 = findViewById(R.id.d4)
        d5 = findViewById(R.id.d5)
        d6 = findViewById(R.id.d6)
        d7 = findViewById(R.id.d7)
        n2 = findViewById(R.id.n2)
        n3 = findViewById(R.id.n3)
        n4 = findViewById(R.id.n4)
        n5 = findViewById(R.id.n5)
        n6 = findViewById(R.id.n6)
        n7 = findViewById(R.id.n7)
        n8 = findViewById(R.id.n8)
        n9 = findViewById(R.id.n9)
        n10 = findViewById(R.id.n10)
        i2 = findViewById(R.id.i2)
        i3 = findViewById(R.id.i3)
        i4 = findViewById(R.id.i4)
        i5 = findViewById(R.id.i5)
        i6 = findViewById(R.id.i6)
        h2 = findViewById(R.id.h2)
        h3 = findViewById(R.id.h3)
        h4 = findViewById(R.id.h4)
        h6 = findViewById(R.id.h6)
        h7 = findViewById(R.id.h7)
        h8 = findViewById(R.id.h8)
        h9 = findViewById(R.id.h9)
        h10 = findViewById(R.id.h10)
        h11 = findViewById(R.id.h11)
        h12 = findViewById(R.id.h12)
        f2 = findViewById(R.id.f2)
        f3 = findViewById(R.id.f3)
        f4 = findViewById(R.id.f4)
        f5 = findViewById(R.id.f5)
        f6 = findViewById(R.id.f6)
        f7 = findViewById(R.id.f7)
        f8 = findViewById(R.id.f8)
        f9 = findViewById(R.id.f9)
        f11 = findViewById(R.id.f11)
        f12 = findViewById(R.id.f12)
        f13 = findViewById(R.id.f13)
        f14 = findViewById(R.id.f14)
        f15 = findViewById(R.id.f15)
        f16 = findViewById(R.id.f16)
        f17 = findViewById(R.id.f17)
        f18 = findViewById(R.id.f18)
        f19 = findViewById(R.id.f19)
        f20 = findViewById(R.id.f20)
        f21 = findViewById(R.id.f21)
        f22 = findViewById(R.id.f22)
        f23 = findViewById(R.id.f23)
        p2 = findViewById(R.id.p2)
        p3 = findViewById(R.id.p3)
        p4 = findViewById(R.id.p4)
        p5 = findViewById(R.id.p5)
        p7 = findViewById(R.id.p7)
        p8 = findViewById(R.id.p8)
        p9 = findViewById(R.id.p9)
        p11 = findViewById(R.id.p11)
        p12 = findViewById(R.id.p12)
        p14 = findViewById(R.id.p14)
        p16 = findViewById(R.id.p16)
        p18 = findViewById(R.id.p18)
        p19 = findViewById(R.id.p19)
        l2 = findViewById(R.id.l2)
        l3 = findViewById(R.id.l3)
        l4 = findViewById(R.id.l4)
        l5 = findViewById(R.id.l5)
        l7 = findViewById(R.id.l7)
        l8 = findViewById(R.id.l8)
        l9 = findViewById(R.id.l9)
        l10 = findViewById(R.id.l10)
        l12 = findViewById(R.id.l12)
        l13 = findViewById(R.id.l13)
        l14 = findViewById(R.id.l14)
        l15 = findViewById(R.id.l15)
        l16 = findViewById(R.id.l16)
        l17 = findViewById(R.id.l17)
        l18 = findViewById(R.id.l18)
        l20 = findViewById(R.id.l20)
        l21 = findViewById(R.id.l21)
        l22 = findViewById(R.id.l22)
        l23 = findViewById(R.id.l23)
        l24 = findViewById(R.id.l24)
        l25 = findViewById(R.id.l25)
        m2 = findViewById(R.id.m2)
        m3 = findViewById(R.id.m3)
        m4 = findViewById(R.id.m4)
        m5 = findViewById(R.id.m5)
        m6 = findViewById(R.id.m6)
        m7 = findViewById(R.id.m7)
        m8 = findViewById(R.id.m8)
        m9 = findViewById(R.id.m9)
        m11 = findViewById(R.id.m11)
        m12 = findViewById(R.id.m12)
        m13 = findViewById(R.id.m13)
        m15 = findViewById(R.id.m15)
        m16 = findViewById(R.id.m16)
        m17 = findViewById(R.id.m17)
        m18 = findViewById(R.id.m18)
        m19 = findViewById(R.id.m19)
        m20 = findViewById(R.id.m20)
        m21 = findViewById(R.id.m21)
        m22 = findViewById(R.id.m22)
        m23 = findViewById(R.id.m23)
        m24 = findViewById(R.id.m24)
        m25 = findViewById(R.id.m25)
        m26 = findViewById(R.id.m26)
        m28 = findViewById(R.id.m28)
        m29 = findViewById(R.id.m29)
        m30 = findViewById(R.id.m30)
        m31 = findViewById(R.id.m31)
        m32 = findViewById(R.id.m32)
        m33 = findViewById(R.id.m33)
        m34 = findViewById(R.id.m34)
        m35 = findViewById(R.id.m35)

        g2.alpha=0f
        g3.alpha=0f
        g4.alpha=0f
        g5.alpha=0f
        g6.alpha=0f
        g7.alpha=0f
        g8.alpha=0f
        g9.alpha=0f
        g10.alpha=0f
        j.alpha=0f
        k.alpha=0f
        a.alpha=1f
        b.alpha=0f
        c.alpha=0f
        d.alpha=0f
        e.alpha=0f
        f.alpha=0f
        g.alpha=0f
        h.alpha=0f
        i.alpha=0f
        j.alpha=0f
        k.alpha=0f
        l.alpha=0f
        m.alpha=0f
        n.alpha=0f
        nn.alpha=0f
        o.alpha=0f
        p.alpha=0f
        q.alpha=0f
        j2.alpha=0f
        j3.alpha=0f
        j4.alpha=0f
        j5.alpha=0f
        o2.alpha=0f
        o3.alpha=0f
        o4.alpha=0f
        o5.alpha=0f
        o6.alpha=0f
        o7.alpha=0f
        a2.alpha=0f
        a3.alpha=0f
        a4.alpha=0f
        a5.alpha=0f
        a6.alpha=0f
        b2.alpha=0f
        b3.alpha=0f
        b4.alpha=0f
        b5.alpha=0f
        b6.alpha=0f
        c2.alpha=0f
        c3.alpha=0f
        d2.alpha=0f
        d3.alpha=0f
        d4.alpha=0f
        d5.alpha=0f
        d6.alpha=0f
        d7.alpha=0f
        n2.alpha=0f
        n3.alpha=0f
        n4.alpha=0f
        n5.alpha=0f
        n6.alpha=0f
        n7.alpha=0f
        n8.alpha=0f
        n9.alpha=0f
        n10.alpha=0f
        i2.alpha=0f
        i3.alpha=0f
        i4.alpha=0f
        i5.alpha=0f
        i6.alpha=0f
        h2.alpha=0f
        h3.alpha=0f
        h4.alpha=0f
        h6.alpha=0f
        h7.alpha=0f
        h8.alpha=0f
        h9.alpha=0f
        h10.alpha=0f
        h11.alpha=0f
        h12.alpha=0f
        f2.alpha=0f
        f3.alpha=0f
        f4.alpha=0f
        f5.alpha=0f
        f6.alpha=0f
        f7.alpha=0f
        f8.alpha=0f
        f9.alpha=0f
        f11.alpha=0f
        f12.alpha=0f
        f13.alpha=0f
        f14.alpha=0f
        f15.alpha=0f
        f16.alpha=0f
        f17.alpha=0f
        f18.alpha=0f
        f19.alpha=0f
        f20.alpha=0f
        f21.alpha=0f
        f22.alpha=0f
        f23.alpha=0f
        p2.alpha=0f
        p3.alpha=0f
        p4.alpha=0f
        p5.alpha=0f
        p7.alpha=0f
        p8.alpha=0f
        p9.alpha=0f
        p11.alpha=0f
        p12.alpha=0f
        p14.alpha=0f
        p18.alpha=0f
        p16.alpha=0f
        p19.alpha=0f
        l2.alpha=0f
        l3.alpha=0f
        l4.alpha=0f
        l5.alpha=0f
        l7.alpha=0f
        l8.alpha=0f
        l9.alpha=0f
        l10.alpha=0f
        l12.alpha=0f
        l13.alpha=0f
        l14.alpha=0f
        l15.alpha=0f
        l16.alpha=0f
        l17.alpha=0f
        l18.alpha=0f
        l20.alpha=0f
        l21.alpha=0f
        l22.alpha=0f
        l23.alpha=0f
        l24.alpha=0f
        l25.alpha=0f
        m2.alpha=0f
        m3.alpha=0f
        m4.alpha=0f
        m5.alpha=0f
        m6.alpha=0f
        m7.alpha=0f
        m8.alpha=0f
        m9.alpha=0f
        m11.alpha=0f
        m12.alpha=0f
        m13.alpha=0f
        m15.alpha=0f
        m16.alpha=0f
        m17.alpha=0f
        m18.alpha=0f
        m19.alpha=0f
        m20.alpha=0f
        m21.alpha=0f
        m22.alpha=0f
        m23.alpha=0f
        m24.alpha=0f
        m25.alpha=0f
        m26.alpha=0f
        m28.alpha=0f
        m29.alpha=0f
        m30.alpha=0f
        m31.alpha=0f
        m32.alpha=0f
        m33.alpha=0f
        m34.alpha=0f
        m35.alpha=0f

        derecha.setOnClickListener{
            if (a.alpha==1f){
                a.alpha=0f
                b.alpha=1f
            } else if (b.alpha==1f){
                b.alpha=0f
                c.alpha=1f
            } else if (m32.alpha==1f){
                m32.alpha=0f
                m31.alpha=1f
            } else if (m32.alpha==1f){
                m32.alpha=0f
                m33.alpha=1f
            } else if (m34.alpha==1f){
                m34.alpha=0f
                m35.alpha=1f
                openGameResultFragment()
            }else if (m22.alpha==1f){
                m22.alpha=0f
                m21.alpha=1f
            } else if (m26.alpha==1f){
                m26.alpha=0f
                m29.alpha=1f
            } else if (m11.alpha==1f){
                m11.alpha=0f
                m6.alpha=1f
            } else if (c.alpha==1f){
                c.alpha=0f
                d.alpha=1f
            } else if (e.alpha==1f){
                e.alpha=0f
                f.alpha=1f
            } else if (m24.alpha==1f){
                m24.alpha=0f
                m23.alpha=1f
            } else if (f5.alpha==1f){
                f5.alpha=0f
                f2.alpha=1f
            } else if (m25.alpha==1f){
                m25.alpha=0f
                m28.alpha=1f
            } else if (i.alpha==1f){
                i.alpha=0f
                h.alpha=1f
            } else if (m16.alpha==1f){
                m16.alpha=0f
                m15.alpha=1f
            } else if (m31.alpha==1f){
                m31.alpha=0f
                m33.alpha=1f
            } else if (m17.alpha==1f){
                m17.alpha=0f
                m19.alpha=1f
            }else if (m20.alpha==1f){
                m20.alpha=0f
                m16.alpha=1f
            } else if (m4.alpha==1f){
                m4.alpha=0f
                m5.alpha=1f
            } else if (f6.alpha==1f){
                f6.alpha=0f
                f5.alpha=1f
            } else if (k.alpha==1f){
                k.alpha=0f
                j.alpha=1f
            } else if (j.alpha==1f){
                j.alpha=0f
                j2.alpha=1f
            } else if (j3.alpha==1f){
                j3.alpha=0f
                j5.alpha=1f
            } else if (n.alpha==1f){
                n.alpha=0f
                q.alpha=1f
            } else if (l.alpha==1f){
                l.alpha=0f
                m.alpha=1f
            } else if (nn.alpha==1f){
                nn.alpha=0f
                o.alpha=1f
            } else if (o.alpha==1f){
                o.alpha=0f
                p.alpha=1f
            } else if (j2.alpha==1f){
                j2.alpha=0f
                g2.alpha=1f
            } else if (p5.alpha==1f){
                p5.alpha=0f
                p7.alpha=1f
            } else if (g3.alpha==1f){
                g3.alpha=0f
                g4.alpha=1f
            } else if (g6.alpha==1f){
                g6.alpha=0f
                g5.alpha=1f
            } else if (g8.alpha==1f){
                g8.alpha=0f
                g7.alpha=1f
            } else if (f17.alpha==1f){
                f17.alpha=0f
                f14.alpha=1f
            } else if (l8.alpha==1f){
                l8.alpha=0f
                l9.alpha=1f
            } else if (g10.alpha==1f){
                g10.alpha=0f
                g9.alpha=1f
            } else if (f19.alpha==1f){
                f19.alpha=0f
                f20.alpha=1f
            } else if (o3.alpha==1f){
                o3.alpha=0f
                o4.alpha=1f
            } else if (o5.alpha==1f){
                o5.alpha=0f
                o6.alpha=1f
            } else if (f18.alpha==1f){
                f18.alpha=0f
                f21.alpha=1f
            } else if (o2.alpha==1f){
                o2.alpha=0f
                a2.alpha=1f
            } else if (a4.alpha==1f){
                a4.alpha=0f
                a3.alpha=1f
            } else if (a5.alpha==1f){
                a5.alpha=0f
                a6.alpha=1f
            } else if (b2.alpha==1f){
                b2.alpha=0f
                b3.alpha=1f
            } else if (b5.alpha==1f){
                b5.alpha=0f
                b4.alpha=1f
            } else if (c2.alpha==1f){
                c2.alpha=0f
                b5.alpha=1f
            } else if (d2.alpha==1f){
                d2.alpha=0f
                c2.alpha=1f
            } else if (p9.alpha==1f){
                p9.alpha=0f
                p8.alpha=1f
            } else if (d5.alpha==1f){
                d5.alpha=0f
                d4.alpha=1f
            } else if (d6.alpha==1f){
                d6.alpha=0f
                d7.alpha=1f
            } else if (n3.alpha==1f){
                n3.alpha=0f
                n2.alpha=1f
            } else if (l25.alpha==1f){
                l25.alpha=0f
                l24.alpha=1f
            }  else if (n5.alpha==1f){
                n5.alpha=0f
                n3.alpha=1f
            } else if (n9.alpha==1f){
                n9.alpha=0f
                n8.alpha=1f
            } else if (n7.alpha==1f){
                n7.alpha=0f
                n6.alpha=1f
            } else if (i3.alpha==1f){
                i3.alpha=0f
                i2.alpha=1f
            } else if (i5.alpha==1f){
                i5.alpha=0f
                i4.alpha=1f
            } else if (h2.alpha==1f){
                h2.alpha=0f
                d3.alpha=1f
            } else if (h4.alpha==1f){
                h4.alpha=0f
                h3.alpha=1f
            } else if (h6.alpha==1f){
                h6.alpha=0f
                h4.alpha=1f
            } else if (h9.alpha==1f){
                h9.alpha=0f
                h8.alpha=1f
            } else if (h11.alpha==1f){
                h11.alpha=0f
                h10.alpha=1f
            } else if (f4.alpha==1f){
                f4.alpha=0f
                f3.alpha=1f
            } else if (f7.alpha==1f){
                f7.alpha=0f
                f8.alpha=1f
            } else if (f12.alpha==1f){
                f12.alpha=0f
                f11.alpha=1f
            } else if (f14.alpha==1f){
                f14.alpha=0f
                f13.alpha=1f
            } else if (f15.alpha==1f){
                f15.alpha=0f
                f16.alpha=1f
            } else if (f22.alpha==1f){
                f22.alpha=0f
                f23.alpha=1f
            } else if (p3.alpha==1f){
                p3.alpha=0f
                p2.alpha=1f
            } else if (p4.alpha==1f){
                p4.alpha=0f
                p3.alpha=1f
            } else if (p11.alpha==1f){
                p11.alpha=0f
                p12.alpha=1f
            } else if (p16.alpha==1f){
                p16.alpha=0f
                p14.alpha=1f
            } else if (l2.alpha==1f){
                l2.alpha=0f
                l3.alpha=1f
            } else if (l4.alpha==1f){
                l4.alpha=0f
                l5.alpha=1f
            } else if (l5.alpha==1f){
                l5.alpha=0f
                l7.alpha=1f
            } else if (l12.alpha==1f){
                l12.alpha=0f
                l13.alpha=1f
            } else if (m12.alpha==1f){
                m12.alpha=0f
                m13.alpha=1f
            } else if (l21.alpha==1f){
                l21.alpha=0f
                l18.alpha=1f
            } else if (l13.alpha==1f){
                l13.alpha=0f
                l14.alpha=1f
            } else if (l16.alpha==1f){
                l16.alpha=0f
                l21.alpha=1f
            } else if (l22.alpha==1f){
                l22.alpha=0f
                l23.alpha=1f
            } else if (m2.alpha==1f){
                m2.alpha=0f
                m3.alpha=1f
            } else if (m8.alpha==1f){
                m8.alpha=0f
                m7.alpha=1f
            }

        }
        abajo.setOnClickListener{
            if (h.alpha==1f){
                h.alpha=0f
                b.alpha=1f
            } else if (m20.alpha==1f){
                m20.alpha=0f
                m21.alpha=1f
            } else if (l15.alpha==1f){
                l15.alpha=0f
                l14.alpha=1f
            } else if (b.alpha==1f){
                b.alpha=0f
                g.alpha=1f
            } else if (c.alpha==1f){
                c.alpha=0f
                g.alpha=1f
            } else if (m9.alpha==1f){
                m9.alpha=0f
                m8.alpha=1f
            } else if (m30.alpha==1f){
                m30.alpha=0f
                m29.alpha=1f
            } else if (m29.alpha==1f){
                m29.alpha=0f
                m31.alpha=1f
            } else if (m11.alpha==1f){
                m11.alpha=0f
                m12.alpha=1f
            } else if (m26.alpha==1f){
                m26.alpha=0f
                m28.alpha=1f
            } else if (l22.alpha==1f){
                l22.alpha=0f
                l18.alpha=1f
            } else if (m4.alpha==1f){
                m4.alpha=0f
                m3.alpha=1f
            } else if (m16.alpha==1f){
                m16.alpha=0f
                m17.alpha=1f
            } else if (m17.alpha==1f){
                m17.alpha=0f
                m18.alpha=1f
            } else if (m22.alpha==1f){
                m22.alpha=0f
                m24.alpha=1f
            } else if (m24.alpha==1f){
                m24.alpha=0f
                m25.alpha=1f
            } else if (d.alpha==1f){
                d.alpha=0f
                e.alpha=1f
            } else if (l4.alpha==1f){
                l4.alpha=0f
                l3.alpha=1f
            } else if (m2.alpha==1f){
                m2.alpha=0f
                l22.alpha=1f
            } else if (l24.alpha==1f){
                l24.alpha=0f
                l23.alpha=1f
            } else if (j.alpha==1f){
                j.alpha=0f
                h.alpha=1f
            } else if (m6.alpha==1f){
                m6.alpha=0f
                m7.alpha=1f
            } else if (l17.alpha==1f){
                l17.alpha=0f
                l21.alpha=1f
            } else if (m5.alpha==1f){
                m5.alpha=0f
                m6.alpha=1f
            } else if (j2.alpha==1f){
                j2.alpha=0f
                j3.alpha=1f
            } else if (l13.alpha==1f){
                l13.alpha=0f
                l20.alpha=1f
            } else if (j4.alpha==1f){
                j4.alpha=0f
                j5.alpha=1f
            } else if (k.alpha==1f){
                k.alpha=0f
                n.alpha=1f
            } else if (n.alpha==1f){
                n.alpha=0f
                l.alpha=1f
            } else if (l14.alpha==1f){
                l14.alpha=0f
                l16.alpha=1f
            } else if (nn.alpha==1f){
                nn.alpha=0f
                k.alpha=1f
            } else if (p2.alpha==1f){
                p2.alpha=0f
                p8.alpha=1f
            } else if (p3.alpha==1f){
                p3.alpha=0f
                p19.alpha=1f
            } else if (l9.alpha==1f){
                l9.alpha=0f
                l10.alpha=1f
            } else if (g2.alpha==1f){
                g2.alpha=0f
                g3.alpha=1f
            } else if (p5.alpha==1f){
                p5.alpha=0f
                p4.alpha=1f
            } else if (p11.alpha==1f){
                p11.alpha=0f
                l2.alpha=1f
            } else if (f14.alpha==1f){
                f14.alpha=0f
                f15.alpha=1f
            } else if (f22.alpha==1f){
                f22.alpha=0f
                p2.alpha=1f
            } else if (p16.alpha==1f){
                p16.alpha=0f
                p18.alpha=1f
            } else if (p9.alpha==1f){
                p9.alpha=0f
                p11.alpha=1f
            } else if (g2.alpha==1f){
                g2.alpha=0f
                g3.alpha=1f
            } else if (g4.alpha==1f){
                g4.alpha=0f
                g5.alpha=1f
            } else if (f18.alpha==1f){
                f18.alpha=0f
                f19.alpha=1f
            } else if (f9.alpha==1f){
                f9.alpha=0f
                f8.alpha=1f
            } else if (g6.alpha==1f){
                g6.alpha=0f
                g7.alpha=1f
            } else if (g9.alpha==1f){
                g9.alpha=0f
                g8.alpha=1f
            }else if (h4.alpha==1f){
                h4.alpha=0f
                p14.alpha=1f
            } else if (o.alpha==1f){
                o.alpha=0f
                o2.alpha=1f
            } else if (o2.alpha==1f){
                o2.alpha=0f
                o3.alpha=1f
            } else if (o5.alpha==1f){
                o5.alpha=0f
                o4.alpha=1f
            } else if (o6.alpha==1f){
                o6.alpha=0f
                o7.alpha=1f
            } else if (f6.alpha==1f){
                f6.alpha=0f
                f7.alpha=1f
            } else if (a3.alpha==1f){
                a3.alpha=0f
                a2.alpha=1f
            } else if (a4.alpha==1f){
                a4.alpha=0f
                a5.alpha=1f
            } else if (b2.alpha==1f){
                b2.alpha=0f
                a3.alpha=1f
            } else if (b3.alpha==1f){
                b3.alpha=0f
                b4.alpha=1f
            } else if (b6.alpha==1f){
                b6.alpha=0f
                b5.alpha=1f
            } else if (g2.alpha==1f){
                g2.alpha=0f
                g3.alpha=1f
            } else if (c2.alpha==1f){
                c2.alpha=0f
                c3.alpha=1f
            } else if (d2.alpha==1f){
                d2.alpha=0f
                d3.alpha=1f
            } else if (d3.alpha==1f){
                d3.alpha=0f
                d4.alpha=1f
            } else if (d5.alpha==1f){
                d5.alpha=0f
                d6.alpha=1f
            } else if (b4.alpha==1f){
                b4.alpha=0f
                n2.alpha=1f
            } else if (n3.alpha==1f){
                n3.alpha=0f
                n4.alpha=1f
            } else if (n5.alpha==1f){
                n5.alpha=0f
                n6.alpha=1f
            } else if (n7.alpha==1f){
                n7.alpha=0f
                n8.alpha=1f
            } else if (n9.alpha==1f){
                n9.alpha=0f
                n10.alpha=1f
            } else if (d4.alpha==1f){
                d4.alpha=0f
                i2.alpha=1f
            } else if (i3.alpha==1f){
                i3.alpha=0f
                i4.alpha=1f
            } else if (i5.alpha==1f){
                i5.alpha=0f
                i6.alpha=1f
            } else if (h2.alpha==1f){
                h2.alpha=0f
                h3.alpha=1f
            } else if (h7.alpha==1f){
                h7.alpha=0f
                h6.alpha=1f
            } else if (h6.alpha==1f){
                h6.alpha=0f
                h8.alpha=1f
            } else if (h10.alpha==1f){
                h10.alpha=0f
                h9.alpha=1f
            } else if (h12.alpha==1f){
                h12.alpha=0f
                h11.alpha=1f
            } else if (f2.alpha==1f){
                f2.alpha=0f
                h4.alpha=1f
            } else if (f3.alpha==1f){
                f3.alpha=0f
                f2.alpha=1f
            } else if (f5.alpha==1f){
                f5.alpha=0f
                f11.alpha=1f
            } else if (f13.alpha==1f){
                f13.alpha=0f
                f12.alpha=1f
            } else if (f17.alpha==1f){
                f17.alpha=0f
                f18.alpha=1f
            } else if (f21.alpha==1f){
                f21.alpha=0f
                f22.alpha=1f
            } else if (l8.alpha==1f){
                l8.alpha=0f
                l7.alpha=1f
            } else if (l12.alpha==1f){
                l12.alpha=0f
                l5.alpha=1f
            } else if (m13.alpha==1f){
                m13.alpha=0f
                m15.alpha=1f
            } else if (m34.alpha==1f){
                m34.alpha=0f
                m33.alpha=1f
            }
        }
        izquierda.setOnClickListener{
            if (b.alpha==1f){
                b.alpha=0f
                a.alpha=1f
            } else if (c.alpha==1f){
                c.alpha=0f
                b.alpha=1f
            } else if (m21.alpha==1f){
                m21.alpha=0f
                m22.alpha=1f
            } else if (m28.alpha==1f){
                m28.alpha=0f
                m25.alpha=1f
            } else if (m33.alpha==1f){
                m33.alpha=0f
                m31.alpha=1f
            } else if (d.alpha==1f){
                d.alpha=0f
                c.alpha=1f
            } else if (m16.alpha==1f){
                m16.alpha=0f
                m20.alpha=1f
            } else if (f.alpha==1f){
                f.alpha=0f
                e.alpha=1f
            } else if (f13.alpha==1f){
                f13.alpha=0f
                f14.alpha=1f
            } else if (m29.alpha==1f){
                m29.alpha=0f
                m26.alpha=1f
            } else if (l24.alpha==1f){
                l24.alpha=0f
                l25.alpha=1f
            } else if (l9.alpha==1f){
                l9.alpha=0f
                l8.alpha=1f
            } else if (f11.alpha==1f){
                f11.alpha=0f
                f12.alpha=1f
            } else if (m7.alpha==1f){
                m7.alpha=0f
                m8.alpha=1f
            } else if (h.alpha==1f){
                h.alpha=0f
                i.alpha=1f
            } else if (j.alpha==1f){
                j.alpha=0f
                k.alpha=1f
            } else if (f5.alpha==1f){
                f5.alpha=0f
                f6.alpha=1f
            } else if (j2.alpha==1f){
                j2.alpha=0f
                j.alpha=1f
            } else if (j5.alpha==1f){
                j5.alpha=0f
                j3.alpha=1f
            } else if (q.alpha==1f){
                q.alpha=0f
                n.alpha=1f
            } else if (f14.alpha==1f){
                f14.alpha=0f
                f17.alpha=1f
            } else if (l14.alpha==1f){
                l14.alpha=0f
                l13.alpha=1f
            } else if (f8.alpha==1f){
                f8.alpha=0f
                f7.alpha=1f
            } else if (p3.alpha==1f){
                p3.alpha=0f
                p4.alpha=1f
            } else if (m.alpha==1f){
                m.alpha=0f
                l.alpha=1f
            } else if (f21.alpha==1f){
                f21.alpha=0f
                f18.alpha=1f
            } else if (p.alpha==1f){
                p.alpha=0f
                o.alpha=1f
            } else if (l7.alpha==1f){
                l7.alpha=0f
                l5.alpha=1f
            } else if (m6.alpha==1f){
                m6.alpha=0f
                m11.alpha=1f
            } else if (o.alpha==1f){
                o.alpha=0f
                nn.alpha=1f
            } else if (g2.alpha==1f){
                g2.alpha=0f
                j2.alpha=1f
            } else if (g4.alpha==1f){
                g4.alpha=0f
                g3.alpha=1f
            } else if (f20.alpha==1f){
                f20.alpha=0f
                f19.alpha=1f
            } else if (g5.alpha==1f){
                g5.alpha=0f
                g6.alpha=1f
            } else if (g7.alpha==1f){
                g7.alpha=0f
                g8.alpha=1f
            } else if (g9.alpha==1f){
                g9.alpha=0f
                g10.alpha=1f
            } else if (p2.alpha==1f){
                p2.alpha=0f
                p3.alpha=1f
            } else if (o4.alpha==1f){
                o4.alpha=0f
                o3.alpha=1f
            } else if (o6.alpha==1f){
                o6.alpha=0f
                o5.alpha=1f
            } else if (a2.alpha==1f){
                a2.alpha=0f
                o2.alpha=1f
            } else if (a3.alpha==1f){
                a3.alpha=0f
                a4.alpha=1f
            } else if (g2.alpha==1f){
                g2.alpha=0f
                g3.alpha=1f
            } else if (a6.alpha==1f){
                a6.alpha=0f
                a5.alpha=1f
            } else if (p8.alpha==1f){
                p8.alpha=0f
                p9.alpha=1f
            } else if (b3.alpha==1f){
                b3.alpha=0f
                b2.alpha=1f
            } else if (b4.alpha==1f){
                b4.alpha=0f
                b5.alpha=1f
            } else if (b5.alpha==1f){
                b5.alpha=0f
                c2.alpha=1f
            } else if (c2.alpha==1f){
                c2.alpha=0f
                d2.alpha=1f
            } else if (d4.alpha==1f){
                d4.alpha=0f
                d5.alpha=1f
            } else if (d7.alpha==1f){
                d7.alpha=0f
                d6.alpha=1f
            } else if (n2.alpha==1f){
                n2.alpha=0f
                n3.alpha=1f
            } else if (n3.alpha==1f){
                n3.alpha=0f
                n5.alpha=1f
            } else if (n8.alpha==1f){
                n8.alpha=0f
                n9.alpha=1f
            } else if (n6.alpha==1f){
                n6.alpha=0f
                n7.alpha=1f
            } else if (p7.alpha==1f){
                p7.alpha=0f
                p5.alpha=1f
            } else if (i2.alpha==1f){
                i2.alpha=0f
                i3.alpha=1f
            } else if (i4.alpha==1f){
                i4.alpha=0f
                i5.alpha=1f
            } else if (d3.alpha==1f){
                d3.alpha=0f
                h2.alpha=1f
            } else if (h3.alpha==1f){
                h3.alpha=0f
                h4.alpha=1f
            } else if (h4.alpha==1f){
                h4.alpha=0f
                h6.alpha=1f
            } else if (h8.alpha==1f){
                h8.alpha=0f
                h9.alpha=1f
            } else if (h10.alpha==1f){
                h10.alpha=0f
                h11.alpha=1f
            } else if (f3.alpha==1f){
                f3.alpha=0f
                f4.alpha=1f
            } else if (f2.alpha==1f){
                f2.alpha=0f
                f5.alpha=1f
            } else if (f16.alpha==1f){
                f16.alpha=0f
                f15.alpha=1f
            } else if (f23.alpha==1f){
                f23.alpha=0f
                f22.alpha=1f
            } else if (p12.alpha==1f){
                p12.alpha=0f
                p11.alpha=1f
            } else if (p14.alpha==1f){
                p14.alpha=0f
                p16.alpha=1f
            } else if (l3.alpha==1f){
                l3.alpha=0f
                l2.alpha=1f
            } else if (l5.alpha==1f){
                l5.alpha=0f
                l4.alpha=1f
            } else if (l13.alpha==1f){
                l13.alpha=0f
                l12.alpha=1f
            } else if (l21.alpha==1f){
                l21.alpha=0f
                l16.alpha=1f
            } else if (l18.alpha==1f){
                l18.alpha=0f
                l21.alpha=1f
            } else if (l23.alpha==1f){
                l23.alpha=0f
                l22.alpha=1f
            } else if (m3.alpha==1f){
                m3.alpha=0f
                m2.alpha=1f
            } else if (m5.alpha==1f){
                m5.alpha=0f
                m4.alpha=1f
            } else if (m13.alpha==1f){
                m13.alpha=0f
                m12.alpha=1f
            } else if (m15.alpha==1f){
                m15.alpha=0f
                m16.alpha=1f
            } else if (m19.alpha==1f){
                m19.alpha=0f
                m17.alpha=1f
            } else if (m23.alpha==1f){
                m23.alpha=0f
                m24.alpha=1f
            } else if (m31.alpha==1f){
                m31.alpha=0f
                m32.alpha=1f
            }
        }
        arriba.setOnClickListener{
            if (b.alpha==1f){
                b.alpha=0f
                h.alpha=1f
            } else if (g.alpha==1f){
                g.alpha=0f
                c.alpha=1f
            }else if (m21.alpha==1f){
                m21.alpha=0f
                m20.alpha=1f
            } else if (e.alpha==1f){
                e.alpha=0f
                d.alpha=1f
            } else if (l7.alpha==1f){
                l7.alpha=0f
                l8.alpha=1f
            } else if (h.alpha==1f){
                h.alpha=0f
                j.alpha=1f
            } else if (l5.alpha==1f){
                l5.alpha=0f
                l12.alpha=1f
            } else if (j3.alpha==1f){
                j3.alpha=0f
                j2.alpha=1f
            } else if (m18.alpha==1f){
                m18.alpha=0f
                m17.alpha=1f
            }else if (m17.alpha==1f){
                m17.alpha=0f
                m16.alpha=1f
            } else if (l10.alpha==1f){
                l10.alpha=0f
                l9.alpha=1f
            } else if (f12.alpha==1f){
                f12.alpha=0f
                f13.alpha=1f
            } else if (j5.alpha==1f){
                j5.alpha=0f
                j4.alpha=1f
            } else if (l22.alpha==1f){
                l22.alpha=0f
                m2.alpha=1f
            } else if (n.alpha==1f){
                n.alpha=0f
                k.alpha=1f
            } else if (f15.alpha==1f){
                f15.alpha=0f
                f14.alpha=1f
            } else if (l20.alpha==1f){
                l20.alpha=0f
                l13.alpha=1f
            } else if (l.alpha==1f){
                l.alpha=0f
                n.alpha=1f
            } else if (l23.alpha==1f){
                l23.alpha=0f
                l24.alpha=1f
            } else if (f19.alpha==1f){
                f19.alpha=0f
                f18.alpha=1f
            } else if (k.alpha==1f){
                k.alpha=0f
                nn.alpha=1f
            } else if (p2.alpha==1f){
                p2.alpha=0f
                f22.alpha=1f
            } else if (l2.alpha==1f){
                l2.alpha=0f
                p11.alpha=1f
            } else if (l3.alpha==1f){
                l3.alpha=0f
                l4.alpha=1f
            } else if (p8.alpha==1f){
                p8.alpha=0f
                p2.alpha=1f
            } else if (p18.alpha==1f){
                p18.alpha=0f
                p16.alpha=1f
            } else if (g3.alpha==1f){
                g3.alpha=0f
                g2.alpha=1f
            } else if (f18.alpha==1f){
                f18.alpha=0f
                f17.alpha=1f
            } else if (p11.alpha==1f){
                p11.alpha=0f
                p9.alpha=1f
            }else if (p19.alpha==1f){
                p19.alpha=0f
                p3.alpha=1f
            } else if (g5.alpha==1f){
                g5.alpha=0f
                g4.alpha=1f
            } else if (f22.alpha==1f){
                f22.alpha=0f
                f21.alpha=1f
            } else if (p14.alpha==1f){
                p14.alpha=0f
                h4.alpha=1f
            } else if (f8.alpha==1f){
                f8.alpha=0f
                f9.alpha=1f
            } else if (g7.alpha==1f){
                g7.alpha=0f
                g6.alpha=1f
            } else if (l18.alpha==1f){
                l18.alpha=0f
                l22.alpha=1f
            } else if (p4.alpha==1f){
                p4.alpha=0f
                p5.alpha=1f
            } else if (l16.alpha==1f){
                l16.alpha=0f
                l14.alpha=1f
            } else if (g8.alpha==1f){
                g8.alpha=0f
                g9.alpha=1f
            } else if (o2.alpha==1f){
                o2.alpha=0f
                o.alpha=1f
            } else if (o3.alpha==1f){
                o3.alpha=0f
                o2.alpha=1f
            }else if (m12.alpha==1f){
                m12.alpha=0f
                m11.alpha=1f
            } else if (f11.alpha==1f){
                f11.alpha=0f
                f5.alpha=1f
            } else if (o4.alpha==1f){
                o4.alpha=0f
                o5.alpha=1f
            } else if (o7.alpha==1f){
                o7.alpha=0f
                o6.alpha=1f
            } else if (a2.alpha==1f){
                a2.alpha=0f
                a3.alpha=1f
            } else if (a5.alpha==1f){
                a5.alpha=0f
                a4.alpha=1f
            } else if (a3.alpha==1f){
                a3.alpha=0f
                b2.alpha=1f
            } else if (b4.alpha==1f){
                b4.alpha=0f
                b3.alpha=1f
            } else if (b5.alpha==1f){
                b5.alpha=0f
                b6.alpha=1f
            } else if (c3.alpha==1f){
                c3.alpha=0f
                c2.alpha=1f
            } else if (d3.alpha==1f){
                d3.alpha=0f
                d2.alpha=1f
            } else if (d4.alpha==1f){
                d4.alpha=0f
                d3.alpha=1f
            } else if (l21.alpha==1f){
                l21.alpha=0f
                l17.alpha=1f
            } else if (d6.alpha==1f){
                d6.alpha=0f
                d5.alpha=1f
            } else if (n2.alpha==1f){
                n2.alpha=0f
                b4.alpha=1f
            } else if (f7.alpha==1f){
                f7.alpha=0f
                f6.alpha=1f
            } else if (n4.alpha==1f){
                n4.alpha=0f
                n3.alpha=1f
            } else if (n6.alpha==1f){
                n6.alpha=0f
                n5.alpha=1f
            } else if (n8.alpha==1f){
                n8.alpha=0f
                n7.alpha=1f
            } else if (m28.alpha==1f){
                m28.alpha=0f
                m26.alpha=1f
            } else if (m6.alpha==1f){
                m6.alpha=0f
                m5.alpha=1f
            } else if (m7.alpha==1f){
                m7.alpha=0f
                m6.alpha=1f
            } else if (n10.alpha==1f){
                n10.alpha=0f
                n9.alpha=1f
            } else if (i2.alpha==1f){
                i2.alpha=0f
                d4.alpha=1f
            } else if (m8.alpha==1f){
                m8.alpha=0f
                m9.alpha=1f
            } else if (i4.alpha==1f){
                i4.alpha=0f
                i3.alpha=1f
            } else if (i6.alpha==1f){
                i6.alpha=0f
                i5.alpha=1f
            } else if (h3.alpha==1f){
                h3.alpha=0f
                h2.alpha=1f
            } else if (h6.alpha==1f){
                h6.alpha=0f
                h7.alpha=1f
            } else if (h8.alpha==1f){
                h8.alpha=0f
                h6.alpha=1f
            } else if (m3.alpha==1f){
                m3.alpha=0f
                m4.alpha=1f
            } else if (h9.alpha==1f){
                h9.alpha=0f
                h10.alpha=1f
            } else if (m15.alpha==1f){
                m15.alpha=0f
                m13.alpha=1f
            } else if (h11.alpha==1f){
                h11.alpha=0f
                h12.alpha=1f
            } else if (m31.alpha==1f){
                m31.alpha=0f
                m29.alpha=1f
            } else if (m29.alpha==1f){
                m29.alpha=0f
                m30.alpha=1f
            }else if (m25.alpha==1f){
                m25.alpha=0f
                m24.alpha=1f
            } else if (m24.alpha==1f){
                m24.alpha=0f
                m22.alpha=1f
            } else if (h4.alpha==1f){
                h4.alpha=0f
                f2.alpha=1f
            } else if (f2.alpha==1f){
                f2.alpha=0f
                f3.alpha=1f
            } else if (m33.alpha==1f){
                m33.alpha=0f
                m34.alpha=1f
            } else if (l14.alpha==1f){
                l14.alpha=0f
                l15.alpha=1f
            }
        }
        berriro.setOnClickListener{
            g2.alpha=0f
            g3.alpha=0f
            g4.alpha=0f
            g5.alpha=0f
            g6.alpha=0f
            g7.alpha=0f
            g8.alpha=0f
            g9.alpha=0f
            g10.alpha=0f
            j.alpha=0f
            k.alpha=0f
            a.alpha=1f
            b.alpha=0f
            c.alpha=0f
            d.alpha=0f
            e.alpha=0f
            f.alpha=0f
            g.alpha=0f
            h.alpha=0f
            i.alpha=0f
            j.alpha=0f
            k.alpha=0f
            l.alpha=0f
            m.alpha=0f
            n.alpha=0f
            nn.alpha=0f
            o.alpha=0f
            p.alpha=0f
            q.alpha=0f
            j2.alpha=0f
            j3.alpha=0f
            j4.alpha=0f
            j5.alpha=0f
            o2.alpha=0f
            o3.alpha=0f
            o4.alpha=0f
            o5.alpha=0f
            o6.alpha=0f
            o7.alpha=0f
            a2.alpha=0f
            a3.alpha=0f
            a4.alpha=0f
            a5.alpha=0f
            a6.alpha=0f
            b2.alpha=0f
            b3.alpha=0f
            b4.alpha=0f
            b5.alpha=0f
            b6.alpha=0f
            c2.alpha=0f
            c3.alpha=0f
            d2.alpha=0f
            d3.alpha=0f
            d4.alpha=0f
            d5.alpha=0f
            d6.alpha=0f
            d7.alpha=0f
            n2.alpha=0f
            n3.alpha=0f
            n4.alpha=0f
            n5.alpha=0f
            n6.alpha=0f
            n7.alpha=0f
            n8.alpha=0f
            n9.alpha=0f
            n10.alpha=0f
            i2.alpha=0f
            i3.alpha=0f
            i4.alpha=0f
            i5.alpha=0f
            i6.alpha=0f
            h2.alpha=0f
            h3.alpha=0f
            h4.alpha=0f
            h6.alpha=0f
            h7.alpha=0f
            h8.alpha=0f
            h9.alpha=0f
            h10.alpha=0f
            h11.alpha=0f
            h12.alpha=0f
            f2.alpha=0f
            f3.alpha=0f
            f4.alpha=0f
            f5.alpha=0f
            f6.alpha=0f
            f7.alpha=0f
            f8.alpha=0f
            f9.alpha=0f
            f11.alpha=0f
            f12.alpha=0f
            f13.alpha=0f
            f14.alpha=0f
            f15.alpha=0f
            f16.alpha=0f
            f17.alpha=0f
            f18.alpha=0f
            f19.alpha=0f
            f20.alpha=0f
            f21.alpha=0f
            f22.alpha=0f
            f23.alpha=0f
            p2.alpha=0f
            p3.alpha=0f
            p4.alpha=0f
            p5.alpha=0f
            p7.alpha=0f
            p8.alpha=0f
            p9.alpha=0f
            p11.alpha=0f
            p12.alpha=0f
            p14.alpha=0f
            p18.alpha=0f
            p16.alpha=0f
            p19.alpha=0f
            l2.alpha=0f
            l3.alpha=0f
            l4.alpha=0f
            l5.alpha=0f
            l7.alpha=0f
            l8.alpha=0f
            l9.alpha=0f
            l10.alpha=0f
            l12.alpha=0f
            l13.alpha=0f
            l14.alpha=0f
            l15.alpha=0f
            l16.alpha=0f
            l17.alpha=0f
            l18.alpha=0f
            l20.alpha=0f
            l21.alpha=0f
            l22.alpha=0f
            l23.alpha=0f
            l24.alpha=0f
            l25.alpha=0f
            m2.alpha=0f
            m3.alpha=0f
            m4.alpha=0f
            m5.alpha=0f
            m6.alpha=0f
            m7.alpha=0f
            m8.alpha=0f
            m9.alpha=0f
            m11.alpha=0f
            m12.alpha=0f
            m13.alpha=0f
            m15.alpha=0f
            m16.alpha=0f
            m17.alpha=0f
            m18.alpha=0f
            m19.alpha=0f
            m20.alpha=0f
            m21.alpha=0f
            m22.alpha=0f
            m23.alpha=0f
            m24.alpha=0f
            m25.alpha=0f
            m26.alpha=0f
            m28.alpha=0f
            m29.alpha=0f
            m30.alpha=0f
            m31.alpha=0f
            m32.alpha=0f
            m33.alpha=0f
            m34.alpha=0f
            m35.alpha=0f
        }

    }
    private fun openGameResultFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        val gameResultFragment = final_fragment_juego4()
        fragmentTransaction.replace(R.id.fragmento, gameResultFragment)

        fragmentTransaction.commit()
    }
}