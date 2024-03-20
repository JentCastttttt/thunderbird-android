package app.k9mail.core.ui.compose.designsystem.atom.image

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.k9mail.core.ui.compose.designsystem.PreviewWithTheme
import app.k9mail.core.ui.compose.theme2.MainTheme

@Preview(showBackground = true)
@Composable
internal fun FixedScaleImageBottomCenterPreview() {
    PreviewWithTheme {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp),
        ) {
            FixedScaleImage(
                id = MainTheme.images.logo,
                alignment = Alignment.BottomCenter,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun FixedScaleImageCroppedPreview() {
    PreviewWithTheme {
        Box(
            modifier = Modifier
                .width(40.dp)
                .height(40.dp),
        ) {
            FixedScaleImage(
                id = MainTheme.images.logo,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
internal fun FixedScaleImageHorizontallyCroppedPreview() {
    PreviewWithTheme {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(20.dp),
        ) {
            FixedScaleImage(
                id = MainTheme.images.logo,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
internal fun FixedScaleImageVerticallyCroppedPreview() {
    PreviewWithTheme {
        Box(
            modifier = Modifier
                .width(20.dp)
                .height(200.dp),
        ) {
            FixedScaleImage(
                id = MainTheme.images.logo,
            )
        }
    }
}
