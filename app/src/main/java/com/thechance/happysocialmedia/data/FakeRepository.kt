package com.thechance.happysocialmedia.data

import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.domain.models.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class FakeRepository @Inject constructor(): HappySocialRepository {

    override fun getAllPosts(): Flow<List<Post>> = flow {
        val result = listOf(
            Post(
                0,
                "Shahad Abdulhasan",
                "https://cdn.mos.cms.futurecdn.net/CAZ6JXi6huSuN4QGE627NR.jpg",
                "https://img.wattpad.com/ac774401878614400d9ff2eba27870e8cca3ba8f/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a7445346c65564975635a4834773d3d2d3434393237343839362e313464363865343537326634373334323733303639343033363234382e6a7067",
                "Good Morning Elite Team , How are you?",
                "2030-12-12",
                220,
                3,
            ),
            Post(
                1,
                "Shahad Kadhim",
                "https://cdn.britannica.com/q:60/91/181391-050-1DA18304/cat-toes-paw-number-paws-tiger-tabby.jpg",
                "https://i.pinimg.com/originals/5a/23/d7/5a23d7a5b80c846695b7c92b2876f09e.jpg",
                "Good Morning Elite Team , How are you?",
                "2020-7-2",
                30,
                1,
            ),
            Post(
                2,
                "Shahad Tariq",
                "https://picjumbo.com/wp-content/uploads/the-golden-gate-bridge-sunset-1080x720.jpg",
                "https://pbs.twimg.com/profile_images/1346200826998644736/GXKFXDl7_400x400.jpg",
                "Good Morning Elite Team , How are you?",
                "2010-1-10",
                20,
                3,
            ),
            Post(
                3,
                "Ahmed Yusef",
                "https://thumbs.dreamstime.com/b/woman-praying-free-birds-to-nature-sunset-background-woman-praying-free-birds-enjoying-nature-sunset-99680945.jpg",
                "https://transportationenergypartners.org/wp-content/uploads/2020/08/random-person-3.jpg",
                "Good Morning Elite Team , How are you?\nGood Morning Elite Team , How are you?\nGood Morning Elite Team , How are you?\nGood Morning Elite Team , How are you?\nGood Morning Elite Team , How are you?\nGood Morning Elite Team , How are you?\nGood Morning Elite Team , How are you?\nGood Morning Elite Team , How are you?",
                "2045-12-12",
                2200,
                30,
            ),
            Post(
                4,
                "Ahmed Moanas",
                "https://media.istockphoto.com/photos/slave-hands-broken-chains-with-bird-flying-picture-id1296601764?b=1&k=20&m=1296601764&s=170667a&w=0&h=0hjKKZZYp2Wl1BRxopegdWrJwTwi1Vlbs_aXdmhhr_o=",
                "https://www.archiefoundationhome.org.uk/wp-content/uploads/2020/05/profile-photo-social-media.jpg",
                "Good Morning Elite Team , How are you?",
                "2030-12-12",
                220,
                3,
            ),
            Post(
                5,
                "Nooraldeen",
                "https://images.pexels.com/photos/5232649/pexels-photo-5232649.jpeg?auto=compress&cs=tinysrgb&fit=crop&fp-y=0.54&h=500&sharp=20&w=1400",
                "https://pbs.twimg.com/profile_images/1346200826998644736/GXKFXDl7_400x400.jpg",
                "My name is Noor, I'm 27 Years Old",
                "2030-12-12",
                9000,
                0,
            ),
            Post(
                6,
                "Ammar Thaer",
                "https://burst.shopify.com/photos/person-holds-a-book-over-a-stack-and-turns-the-page/download",
                "https://pbs.twimg.com/profile_images/1346200826998644736/GXKFXDl7_400x400.jpg",
                "Good Morning Elite Team , How are you?",
                "2022-2-12",
                237,
                13,
            ),
            Post(
                7,
                "Amnah",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQcovkqo-amf8cBG4RJB75t2e3MVVPkR9c1bQ&usqp=CAU",
                "https://fiverr-res.cloudinary.com/t_profile_original,q_auto,f_auto/attachments/profile/photo/1f846f639010a1e7e1883aaab85b58f0-1533776088426/Screenshot%202018-08-08%20at%208.12.47%20PM%20-%20Edited.png",
                "Good Morning Elite Team , I'm proud of you",
                "2021-1-1",
                210,
                3,
            ),
            Post(
                8,
                "Zahraa Resen",
                "https://static.vecteezy.com/system/resources/thumbnails/002/014/385/original/ripe-apples-falling-through-water-free-video.jpg",
                "https://www.chaac.tf.fau.eu/files/2021/02/1071625.jpg",
                "Good Morning Elite Team , How are you?",
                "2030-12-12",
                220,
                3,
            ),
            Post(
                9,
                "Bareq Al-Taamah",
                "https://images.unsplash.com/photo-1480365501497-199581be0e66?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8cGhvdG9zfGVufDB8fDB8fA%3D%3D&w=1000&q=80",
                "https://pbs.twimg.com/profile_images/1346200826998644736/GXKFXDl7_400x400.jpg",
                "Good Morning Elite Team , How are you?, I'm excited with you today",
                "2030-12-12",
                220,
                3,
            ),

        )
        emit(result)
    }

    override fun getCurrentUserInfo(): Flow<User> = flow {
        val user = User(
            0,
            "Ahmed Yusef",
            "https://transportationenergypartners.org/wp-content/uploads/2020/08/random-person-3.jpg",
            "https://images.unsplash.com/photo-1480365501497-199581be0e66?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8cGhvdG9zfGVufDB8fDB8fA%3D%3D&w=1000&q=80",
            "I am Fine ☺",
            "350",
            "200",
            "145",
            "326",
        )
        emit(user)
    }
}