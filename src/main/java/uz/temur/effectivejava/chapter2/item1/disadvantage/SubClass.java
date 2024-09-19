package uz.temur.effectivejava.chapter2.item1.disadvantage;

//public class SubClass extends MyClass {
//    // Bu kod xatolik beradi, chunki MyClass konstruktoriga kirish mumkin emas
//}

/**
 * SubClass MyClassdan meros ola olmaydi, chunki konstruktor private bo'lgani uchun uni chaqirib bo'lmaydi.
 */

/**
 * Asosiy ma'no:
 * Agar siz faqat static factory metodlardan foydalanishni tanlasangiz va public yoki protected konstruktorlarni
 * taqdim etmasangiz, bu class ni kengaytirish, ya'ni meros olish imkonsiz bo'ladi. Bu esa OOP tamoyillaridan biri
 * bo'lgan inheritance (meros olish) imkoniyatlarini cheklaydi.
 */