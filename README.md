# SlideUp Popup Dialog

Simple Bottom up slide dialog

# Usage

var contentView: View = (getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(R.layout.popup_slideup, null)
val slideupPopup = SlideUpDialog.Builder(this)
                .setContentView(contentView)
                .create()
slideupPopup.show()
contentView.findViewById<Button>(R.id.close).setOnClickListener {
    slideupPopup.dismissAnim()
}


# License

Released under the MIT license - http://opensource.org/licenses/MIT

